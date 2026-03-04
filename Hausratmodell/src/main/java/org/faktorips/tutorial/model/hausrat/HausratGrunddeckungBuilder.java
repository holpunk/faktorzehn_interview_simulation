package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse stellt Methoden bereit, mit denen eine Instanz von
 * HausratGrunddeckung bearbeitet werden kann.
 *
 * @since 1.0
 *
 * @generated
 */
public class HausratGrunddeckungBuilder {
	/**
	 * @generated
	 */
	private final HausratGrunddeckung hausratGrunddeckung;

	/**
	 * @generated
	 */
	private IRuntimeRepository runtimeRepository;

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungBuilder mit einem Runtime
	 * Repository. Dieser Konstruktor ist nur für den internen Gebrauch!
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected HausratGrunddeckungBuilder(HausratGrunddeckung policy, IRuntimeRepository runtimeRepository) {
		this.hausratGrunddeckung = policy;
		this.runtimeRepository = runtimeRepository;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungBuilder setRepository(IRuntimeRepository runtimeRepository) {
		this.runtimeRepository = runtimeRepository;
		return this;
	}

	/**
	 * Gibt die Instanz von HausratGrunddeckung zurück, die von diesem Builder
	 * gebaut wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung getResult() {
		return hausratGrunddeckung;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	public IRuntimeRepository getRepository() {
		return runtimeRepository;
	}

	/**
	 *
	 *
	 * @generated
	 */
	@IpsGenerated
	public static Class<?> getPolicyClass() {
		return HausratGrunddeckung.class;
	}

	/**
	 * Erzeugt einen neuen HausratGrunddeckungBuilder mit einer Instanz von
	 * HausratGrunddeckung.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungBuilder from(HausratGrunddeckung policy) {
		return new HausratGrunddeckungBuilder(policy, null);
	}

	/**
	 * Erzeugt einen neuen HausratGrunddeckungBuilder mit einer Instanz von
	 * HausratGrunddeckung und einem Runtime Repository.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungBuilder from(HausratGrunddeckung policy, IRuntimeRepository runtimeRepository) {
		return new HausratGrunddeckungBuilder(policy, runtimeRepository);
	}

}
