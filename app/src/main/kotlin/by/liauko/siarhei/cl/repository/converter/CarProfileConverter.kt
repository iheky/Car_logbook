package by.liauko.siarhei.cl.repository.converter

import by.liauko.siarhei.cl.database.entity.CarProfileEntity
import by.liauko.siarhei.cl.model.CarProfileModel
import by.liauko.siarhei.cl.util.CarBodyType
import by.liauko.siarhei.cl.util.CarFuelType

/**
 * Utility class for converting entity to model and reverse containing data about car profile
 *
 * @author Siarhei Liauko
 * @since 4.3
 */
object CarProfileConverter {

    /**
     * Converts model to entity
     *
     * @param model model containing information about car profile
     *
     * @return database entity containing information about car profile
     *
     * @since 4.3
     */
    fun convertToEntity(model: CarProfileModel) =
        CarProfileEntity(
            model.id,
            model.name,
            model.bodyType.name,
            model.fuelType.name,
            model.engineVolume
        )

    /**
     * Converts entity to model
     *
     * @param entity database entity containing information about car profile
     *
     * @return model containing information about car profile
     *
     * @since 4.3
     */
    fun convertToData(entity: CarProfileEntity) =
        CarProfileModel(
            entity.id,
            entity.name,
            CarBodyType.valueOf(entity.bodyType),
            CarFuelType.valueOf(entity.fuelType),
            entity.engineVolume
        )
}