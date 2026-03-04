package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse stellt Methoden bereit, mit denen eine Instanz von
 * HausratVertrag bearbeitet werden kann.
 *
 * @since 1.0
 *
 * @generated
 */
public class HausratVertragBuilder {
	/**
	 * @generated
	 */
	private final HausratVertrag hausratVertrag;

	/**
	 * @generated
	 */
	private IRuntimeRepository runtimeRepository;

	/**
	 * Erzeugt eine neue Instanz von HausratVertragBuilder mit einem Runtime
	 * Repository. Dieser Konstruktor ist nur für den internen Gebrauch!
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected HausratVertragBuilder(HausratVertrag policy, IRuntimeRepository runtimeRepository) {
		this.hausratVertrag = policy;
		this.runtimeRepository = runtimeRepository;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	public HausratVertragBuilder setRepository(IRuntimeRepository runtimeRepository) {
		this.runtimeRepository = runtimeRepository;
		return this;
	}

	/**
	 * Setzt den Wert des Attributs zahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertragBuilder zahlweise(Integer newZahlweise) {
		hausratVertrag.setZahlweise(newZahlweise);
		return this;
	}

	/**
	 * Setzt den Wert des Attributs plz.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertragBuilder plz(String newPlz) {
		hausratVertrag.setPlz(newPlz);
		return this;
	}

	/**
	 * Setzt den Wert des Attributs wohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertragBuilder wohnflaeche(Integer newWohnflaeche) {
		hausratVertrag.setWohnflaeche(newWohnflaeche);
		return this;
	}

	/**
	 * Gibt die Instanz von HausratVertrag zurück, die von diesem Builder gebaut
	 * wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag getResult() {
		return hausratVertrag;
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
		return HausratVertrag.class;
	}

	/**
	 * Erzeugt einen neuen HausratVertragBuilder mit einer Instanz von
	 * HausratVertrag.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratVertragBuilder from(HausratVertrag policy) {
		return new HausratVertragBuilder(policy, null);
	}

	/**
	 * Erzeugt einen neuen HausratVertragBuilder mit einer Instanz von
	 * HausratVertrag und einem Runtime Repository.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratVertragBuilder from(HausratVertrag policy, IRuntimeRepository runtimeRepository) {
		return new HausratVertragBuilder(policy, runtimeRepository);
	}

	/**
	 * Erzeugt einen {@link AssociationBuilder} mit dem ein Zielobjekt erstellt und
	 * direkt an eine Beziehung gehängt werden kann. Der {@link AssociationBuilder}
	 * gibt daraufhin immer den Builder des Zielobjekts zurück. Um eine Beziehungen
	 * aufzubauen und immer zu diesem aktuellen Builder zurück zu kehren, kann die
	 * Methode {@link #add()} verwendet werden.
	 *
	 * @see #add()
	 *
	 * @generated
	 */
	@IpsGenerated
	public AssociationBuilder associate() {
		return new AssociationBuilder(this);
	}

	/**
	 * Erzeugt einen {@link AddAssociationBuilder} mit dem ein Zielobjekt erstellt
	 * und direkt an eine Beziehung gehängt werden kann. Der
	 * {@link AddAssociationBuilder} gibt daraufhin immer wieder diesen Builder
	 * zurück um z.B. weitere Beziehungen aufbauen zu können. Um stattdessen den
	 * Builder des Zielobjekts zu erhalten kann die Methode {@link #associate()}
	 * verwendet werden.
	 *
	 * @see #associate()
	 *
	 * @generated
	 */
	@IpsGenerated
	public AddAssociationBuilder add() {
		return new AddAssociationBuilder(this);
	}

	/**
	 * Dies ist eine Wrapper-Klasse für die Setter für Assoziationen. Die Methoden
	 * in dieser Klasse geben einen Builder für die jeweilige Zielklasse zurück.
	 *
	 * @generated
	 */
	public static class AssociationBuilder {

		/**
		 * @generated
		 */
		private HausratVertragBuilder policyBuilder;

		/**
		 * @generated
		 */
		@IpsGenerated
		protected AssociationBuilder(HausratVertragBuilder policyBuilder) {
			this.policyBuilder = policyBuilder;
		}

		/**
		 * Erzeugt eine neue Instanz einer Subklasse von HausratGrunddeckung mit dem
		 * gegebenen Builder und setzt diese als HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public <T extends HausratGrunddeckungBuilder> T hausratGrunddeckung(T targetBuilder) {
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * Erzeugt eine neue Instanz von HausratGrunddeckung und setzt diese als
		 * HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungBuilder hausratGrunddeckung() {
			HausratGrunddeckungBuilder targetBuilder = HausratGrunddeckung.builder();
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * Erzeugt eine neue Instanz von HausratGrunddeckung mit einem gegebenen
		 * Produktbaustein und setzt diese als HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungBuilder hausratGrunddeckung(String productCmptId) {
			if (getRepository() == null) {
				throw new RuntimeException("Kein Repository angegeben!");
			}
			HausratGrunddeckungBuilder targetBuilder = null;
			targetBuilder = HausratGrunddeckung.builder(getRepository(), productCmptId);
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratVertrag getResult() {
			return policyBuilder.getResult();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected IRuntimeRepository getRepository() {
			return policyBuilder.getRepository();
		}
	}

	/**
	 * Dies ist eine Wrapper-Klasse für die Setter für Assoziationen. Die Methoden
	 * in dieser Klasse geben wieder den ursprünglichen HausratVertragBuilder
	 * zurück.
	 *
	 * @generated
	 */
	public static class AddAssociationBuilder {

		/**
		 * @generated
		 */
		private HausratVertragBuilder policyBuilder;

		/**
		 * @generated
		 */
		@IpsGenerated
		protected AddAssociationBuilder(HausratVertragBuilder policyBuilder) {
			this.policyBuilder = policyBuilder;
		}

		/**
		 * Setzt eine existierende Instanz von HausratGrunddeckung als
		 * HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratVertragBuilder hausratGrunddeckung(HausratGrunddeckung targetPolicy) {
			getResult().setHausratGrunddeckung(targetPolicy);
			return done();
		}

		/**
		 * Erzeugt eine neue Instanz einer Subklasse von HausratGrunddeckung mit dem
		 * gegebenen Builder und setzt diese als HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratVertragBuilder hausratGrunddeckung(HausratGrunddeckungBuilder targetBuilder) {
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return done();
		}

		/**
		 * Erzeugt eine neue Instanz von HausratGrunddeckung und setzt diese als
		 * HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratVertragBuilder hausratGrunddeckung() {
			HausratGrunddeckungBuilder targetBuilder = HausratGrunddeckung.builder();
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return done();
		}

		/**
		 * Erzeugt eine neue Instanz von HausratGrunddeckung mit einem gegebenen
		 * Produktbaustein und setzt diese als HausratGrunddeckung.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratVertragBuilder hausratGrunddeckung(String productCmptId) {
			if (getRepository() == null) {
				throw new RuntimeException("Kein Repository angegeben!");
			}
			HausratGrunddeckungBuilder targetBuilder = null;
			targetBuilder = HausratGrunddeckung.builder(getRepository(), productCmptId);
			getResult().setHausratGrunddeckung(targetBuilder.getResult());
			return done();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratVertragBuilder done() {
			return policyBuilder;
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratVertrag getResult() {
			return policyBuilder.getResult();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected IRuntimeRepository getRepository() {
			return policyBuilder.getRepository();
		}
	}

}
