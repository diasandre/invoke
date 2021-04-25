package com.github.diasandre

import arrow.core.partially1

operator fun <P1, P2, R> ((P1, P2) -> R).invoke(p1: P1): (P2) -> R = partially1(p1)

operator fun <P1, P2, P3, R> ((P1, P2, P3) -> R).invoke(p1: P1): (P2, P3) -> R = { p2: P2, p3: P3 -> this(p1, p2, p3) }

operator fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).invoke(p1: P1): (P2, P3, P4) -> R = { p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4) }

