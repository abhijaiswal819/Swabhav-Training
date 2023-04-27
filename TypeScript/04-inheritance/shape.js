"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Shape = void 0;
var Shape = /** @class */ (function () {
    function Shape(x, y) {
        this.x = x;
        this.y = y;
    }
    Shape.prototype.getInfo = function () {
        return "x=".concat(this.x, " and y=").concat(this.y);
    };
    return Shape;
}());
exports.Shape = Shape;
