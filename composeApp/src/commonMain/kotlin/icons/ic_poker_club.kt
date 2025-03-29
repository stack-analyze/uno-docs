package icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ic_poker_club: ImageVector
    get() {
        if (_icPokerClub != null) {
            return _icPokerClub!!
        }
        _icPokerClub = Builder(name = "IcPokerClub", defaultWidth = 70.0.dp, defaultHeight =
        70.0.dp, viewportWidth = 70.0f, viewportHeight = 70.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveToRelative(34.971f, 0.436f)
                curveToRelative(-7.16f, 0.0f, -13.033f, 3.425f, -16.25f, 8.719f)
                curveToRelative(-3.032f, 4.988f, -3.564f, 11.62f, -1.031f, 18.438f)
                curveTo(9.729f, 28.302f, 3.971f, 35.334f, 3.971f, 43.436f)
                curveToRelative(0.0f, 8.016f, 6.123f, 13.0f, 13.0f, 13.0f)
                curveToRelative(3.576f, 0.0f, 7.312f, -0.913f, 10.656f, -2.938f)
                curveToRelative(-0.855f, 5.912f, -4.93f, 12.48f, -8.281f, 15.156f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.971f, 70.436f)
                horizontalLineToRelative(30.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.625f, -1.781f)
                curveTo(47.245f, 65.978f, 43.169f, 59.41f, 42.315f, 53.498f)
                curveTo(45.659f, 55.522f, 49.395f, 56.436f, 52.971f, 56.436f)
                curveTo(59.848f, 56.436f, 65.971f, 51.451f, 65.971f, 43.436f)
                curveTo(65.971f, 35.334f, 60.213f, 28.302f, 52.252f, 27.592f)
                curveTo(54.786f, 20.775f, 54.253f, 14.142f, 51.221f, 9.155f)
                curveTo(48.004f, 3.861f, 42.131f, 0.436f, 34.971f, 0.436f)
                close()
                moveTo(34.971f, 2.436f)
                curveToRelative(6.527f, 0.0f, 11.67f, 3.075f, 14.531f, 7.781f)
                curveToRelative(2.861f, 4.707f, 3.452f, 11.069f, 0.563f, 17.813f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 50.971f, 29.436f)
                curveToRelative(7.485f, 0.0f, 13.0f, 6.444f, 13.0f, 14.0f)
                curveToRelative(0.0f, 7.025f, -5.055f, 11.0f, -11.0f, 11.0f)
                curveToRelative(-3.908f, 0.0f, -8.005f, -1.103f, -11.375f, -3.781f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 39.971f, 51.436f)
                curveToRelative(0.0f, 6.352f, 3.773f, 13.022f, 7.625f, 17.0f)
                lineTo(22.346f, 68.436f)
                curveTo(26.198f, 64.458f, 29.971f, 57.787f, 29.971f, 51.436f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 28.346f, 50.655f)
                curveTo(24.976f, 53.333f, 20.88f, 54.436f, 16.971f, 54.436f)
                curveTo(11.026f, 54.436f, 5.971f, 50.46f, 5.971f, 43.436f)
                curveTo(5.971f, 35.88f, 11.486f, 29.436f, 18.971f, 29.436f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.906f, -1.406f)
                curveTo(16.987f, 21.286f, 17.579f, 14.924f, 20.44f, 10.217f)
                curveTo(23.301f, 5.51f, 28.444f, 2.436f, 34.971f, 2.436f)
                close()
            }
        }
            .build()
        return _icPokerClub!!
    }

private var _icPokerClub: ImageVector? = null