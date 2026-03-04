package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.IModifiableRuntimeRepository;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratGrunddeckungstypBuilder. Ein
 * HausratGrunddeckungstypBuilder stellt alle Funktionen bereit, die für das
 * Bearbeiten einer Instanz der Klasse HausratGrunddeckungstyp notwendig sind.
 * Beachte, dass diese Klasse für Tests gedacht ist. Alle Produktbausteintypen
 * müssen hierfür in einem {@link IModifiableRuntimeRepository} liegen, da die
 * Instanzen in Runtime Repository nicht verändert werden können.
 *
 * @since 1.0
 *
 * @generated
 */
public class HausratGrunddeckungstypBuilder {
	/**
	 * @generated
	 */
	private final IModifiableRuntimeRepository runtimeRepository;

	/**
	 * @generated
	 */
	private final HausratGrunddeckungstyp hausratGrunddeckungstyp;

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstypBuilder mit einem
	 * Produkt. Das Produkt muss im angegebenen {@link IModifiableRuntimeRepository}
	 * liegen, das selbst nicht null sein darf.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected HausratGrunddeckungstypBuilder(HausratGrunddeckungstyp product,
			IModifiableRuntimeRepository runtimeRepository) {
		if (product == null || runtimeRepository == null) {
			throw new RuntimeException("Das Produkt und Repository dürfen nicht null sein!");
		} else {
			runtimeRepository.getExistingProductComponent(product.getId());

			this.runtimeRepository = runtimeRepository;
			this.hausratGrunddeckungstyp = product;
		}
	}

	/**
	 * @return {@link IModifiableRuntimeRepository}, welches gespeichert wurde.
	 *
	 * @generated
	 */
	@IpsGenerated
	public IModifiableRuntimeRepository getRepository() {
		return this.runtimeRepository;
	}

	/**
	 * @return Instanz von HausratGrunddeckungstyp, die gebaut wurde
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungstyp getResult() {
		return hausratGrunddeckungstyp;
	}

	/**
	 * Interne Methode
	 *
	 * @generated
	 */
	@IpsGenerated
	public static Class<?> getProductClass() {
		return HausratGrunddeckungstyp.class;
	}

	/**
	 * Erzeugt ein neues HausratGrunddeckungstypBuilder mit HausratGrunddeckungstyp
	 * und einem Runtime Repository.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungstypBuilder from(HausratGrunddeckungstyp product,
			IModifiableRuntimeRepository runtimeRepository) {
		return new HausratGrunddeckungstypBuilder(product, runtimeRepository);
	}

}
