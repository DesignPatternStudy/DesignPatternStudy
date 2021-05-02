package com.example.decoratorpattern

import org.junit.Test

class DecoratorPatternActivityTest {


    @Test
    fun `HouseBlend 의 cost 는 4000 이어야 한다`() {

        val houseBlend = HouseBlend()

        assert(houseBlend.cost() == 4000)
    }

    @Test
    fun `HouseBlend 의 getDescription 값은 HouseBlend 이어야 한다`() {

        val houseBlend = HouseBlend()

        assert(houseBlend.getDescription() == "HouseBlend")

    }

    @Test
    fun `HouseBlend 에 Shot 를 추가하면 cost 값은 4500 이어야 한다`() {

        val houseBlendAddShot = Shot(HouseBlend())

        assert(houseBlendAddShot.cost() == 4500)

    }

    @Test
    fun `HouseBlend 에 Shot 를 추가하면 getDescription 값은 HouseBlend Add Shot 이어야 한다`() {

        val houseBlendAddShot = Shot(HouseBlend())

        assert(houseBlendAddShot.getDescription() == "HouseBlend Add Shot")

    }

    @Test
    fun `HouseBlend 에 Shot 를 2번 추가하면 getDescription 값은 HouseBlend Add Shot Add Shot 이어야 한다`() {

        val houseBlendAddShotTwice = Shot(Shot(HouseBlend()))

        assert(houseBlendAddShotTwice.getDescription() == "HouseBlend Add Shot Add Shot")

    }


    @Test
    fun `HouseBlend 에 Shot 를 두번 추가하면 cost 값은 5000 이어야 한다`() {

        val houseBlendAddShotTwice = Shot(Shot(HouseBlend()))

        assert(houseBlendAddShotTwice.cost() == 5000)

    }



}