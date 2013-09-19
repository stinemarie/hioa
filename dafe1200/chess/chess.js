var Chessboard = {
 init : function() {
    $(".chessboard td .piece").draggable({ start: Chessboard.start, revert: "invalid" });
  },

 start: function( event, ui ) {
    var piece = new Piece(this);
    piece.legalMoves().droppable({ over: Chessboard.over, out: Chessboard.out, drop: Chessboard.drop });
  },

 over: function( event, ui ) {
    $(event.target).addClass('over');
  },

 out: function( event, ui ) {
    $(event.target).removeClass('over');
  },

 drop: function( event, ui ) {
    $(event.target).removeClass('over');

    // Remove old piece if any and not self
    $(event.target).children().not(ui.draggable).each(function(i) {
        new Piece(this).discard();
      });

    $(event.target).append(ui.draggable.detach()); // Insert new piece
    ui.draggable.css("top", "0px");
    ui.draggable.css("left", "0px");
    $(".chessboard td.ui-droppable").droppable("destroy");
  },
}

var Piece = (function() {
    var Piece = function(element) {
      this.element = $(element);
    };

    Piece.colors = {
      white: ["\u2654", "\u2655", "\u2656", "\u2657", "\u2658", "\u2659"],
      black: ["\u265A", "\u265B", "\u265C", "\u265D", "\u265E", "\u265F"],
    };

    Piece.types = {
      king: ["\u2654", "\u265A"],
      queen: ["\u2655", "\u265B"],
      rook: ["\u2656", "\u265C"],
      bishop: ["\u2657", "\u265D"],
      knight: ["\u2658", "\u265E"],
      pawn: ["\u2659", "\u265F"],
    };

    Piece.prototype.discard = function() {
      this.element.draggable("destroy"); // Discarded pieces can't be moved
      this.element.detach(); // Remove from board
      $('.discarded.' + this.color()).append(this.element); // Add to discarded pile
    };

    Piece.prototype.color = function() {
      var piece = this.element.text();
      var color;
      jQuery.each(Piece.colors, function( c, pieces ) {
          if ( jQuery.inArray(piece, pieces) >= 0 )
            color = c;
        });
      return color;
    };

    Piece.prototype.type = function() {
      var piece = this.element.text();
      var type;
      jQuery.each(Piece.types, function( t, pieces ) {
          if ( jQuery.inArray(piece, pieces) >= 0 )
            type = t;
        });
      return type;
    };

    Piece.prototype.position = function() {
      return {row: this.element.closest('tr').parent().children(":has(td)").index(this.element.closest('tr')),
              col: this.element.closest('tr').children('td').index(this.element.closest('td'))};
    };

    Piece.prototype.legalMoves = function() {
      var pos = this.position();
      var color = this.color();
      var moves = jQuery(); // empty set

      switch ( this.type() ) {
      case "knight":
        jQuery.each([-2, -1, 1, 2], function(_, i) {
            jQuery.each([-2, -1, 1, 2], function(_, j) {
                if ( ( i != j ) && ( -i != j )
                     && ( 0 <=  pos.row + i ) && ( pos.row + i <= 7 )
                     && ( 0 <= pos.col + j ) && ( pos.col + j <= 7 ) ) {
                  moves = moves.add($(".chessboard ").find('tr:has(td)').eq(pos.row + i).find('td').eq(pos.col + j));
                }
              });
          });
        break;
      default:
        moves = $(".chessboard td");
      }

      return moves.filter( function( i ) {
          if ( $(this).is(":empty") )
            return true;
          else
            return new Piece($(this).find('.piece')).color() != color;
        });
    };

    return Piece;
  }());

$(document).ready(Chessboard.init);
