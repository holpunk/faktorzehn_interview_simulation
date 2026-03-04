package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.IModifiableRuntimeRepository;
import java.util.List;
import org.faktorips.values.Money;
import org.faktorips.valueset.ValueSet;
import org.faktorips.runtime.CardinalityRange;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratProduktBuilder. Ein HausratProduktBuilder stellt
 * alle Funktionen bereit, die für das Bearbeiten einer Instanz der Klasse
 * HausratProdukt notwendig sind. Beachte, dass diese Klasse für Tests gedacht
 * ist. Alle Produktbausteintypen müssen hierfür in einem
 * {@link IModifiableRuntimeRepository} liegen, da die Instanzen in Runtime
 * Repository nicht verändert werden können.
 *
 * @since 1.0
 *
 * @generated
 */
public class HausratProduktBuilder {
	/**
	 * @generated
	 */
	private final IModifiableRuntimeRepository runtimeRepository;

	/**
	 * @generated
	 */
	private final HausratProdukt hausratProdukt;

	/**
	 * Erzeugt eine neue Instanz von HausratProduktBuilder mit einem Produkt. Das
	 * Produkt muss im angegebenen {@link IModifiableRuntimeRepository} liegen, das
	 * selbst nicht null sein darf.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected HausratProduktBuilder(HausratProdukt product, IModifiableRuntimeRepository runtimeRepository) {
		if (product == null || runtimeRepository == null) {
			throw new RuntimeException("Das Produkt und Repository dürfen nicht null sein!");
		} else {
			runtimeRepository.getExistingProductComponent(product.getId());

			this.runtimeRepository = runtimeRepository;
			this.hausratProdukt = product;
		}
	}

	/**
	 * Setzt den Wert der Eigenschaft produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder produktname(String produktname) {
		hausratProdukt.setProduktname(produktname);
		return this;
	}

	/**
	 * Setzt den Wert der Eigenschaft vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder vorgabeZahlweise(Integer vorgabeZahlweise) {
		hausratProdukt.setVorgabeZahlweise(vorgabeZahlweise);
		return this;
	}

	/**
	 * Setzt den Wert der Eigenschaft erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder erlaubteZahlweisen(List<Integer> erlaubteZahlweisen) {
		hausratProdukt.setErlaubteZahlweisen(erlaubteZahlweisen);
		return this;
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder wertebereichWohnflaeche(Integer wertebereichWohnflaeche) {
		hausratProdukt.setWertebereichWohnflaeche(wertebereichWohnflaeche);
		return this;
	}

	/**
	 * Setzt den Wert der Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder vorschlagVersSummeProQm(Money vorschlagVersSummeProQm) {
		hausratProdukt.setVorschlagVersSummeProQm(vorschlagVersSummeProQm);
		return this;
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder wertebereichVersSumme(List<Money> wertebereichVersSumme) {
		hausratProdukt.setWertebereichVersSumme(wertebereichVersSumme);
		return this;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft zahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder zahlweiseDefault(Integer zahlweise) {
		hausratProdukt.setDefaultValueZahlweise(zahlweise);
		return this;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut zahlweise.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder zahlweiseAllowedValues(ValueSet<Integer> zahlweise) {
		hausratProdukt.setAllowedValuesForZahlweise(zahlweise);
		return this;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft wohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder wohnflaecheDefault(Integer wohnflaeche) {
		hausratProdukt.setDefaultValueWohnflaeche(wohnflaeche);
		return this;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut wohnflaeche.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder wohnflaecheAllowedValues(ValueSet<Integer> wohnflaeche) {
		hausratProdukt.setAllowedValuesForWohnflaeche(wohnflaeche);
		return this;
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
	 * @return Instanz von HausratProdukt, die gebaut wurde
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProdukt getResult() {
		return hausratProdukt;
	}

	/**
	 * Interne Methode
	 *
	 * @generated
	 */
	@IpsGenerated
	public static Class<?> getProductClass() {
		return HausratProdukt.class;
	}

	/**
	 * Erzeugt ein neues HausratProduktBuilder mit HausratProdukt und einem Runtime
	 * Repository.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratProduktBuilder from(HausratProdukt product, IModifiableRuntimeRepository runtimeRepository) {
		return new HausratProduktBuilder(product, runtimeRepository);
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
	 * in dieser Klasse geben einen Builder für die Zielklasse zurück.
	 *
	 * @generated
	 */
	public static class AssociationBuilder {

		/**
		 * @generated
		 */
		private HausratProduktBuilder productBuilder;

		/**
		 * @generated
		 */
		@IpsGenerated
		protected AssociationBuilder(HausratProduktBuilder productBuilder) {
			this.productBuilder = productBuilder;
		}

		/**
		 * Holt eine Instanz von einer Subklasse von HausratGrunddeckungstyp mit
		 * ProductCmptID und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public <T extends HausratGrunddeckungstypBuilder> T hausratGrunddeckungstyp(T targetBuilder) {
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * Holt eine Instanz von einer Subklasse von HausratGrunddeckungstyp mit
		 * ProductCmptID und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public <T extends HausratGrunddeckungstypBuilder> T hausratGrunddeckungstyp(T targetBuilder,
				CardinalityRange cardinality) {
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return targetBuilder;
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp mit einem
		 * Produktbaustein und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungstypBuilder hausratGrunddeckungstyp(String productCmptId) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(),
					productCmptId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp und setzt diese als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungstypBuilder hausratGrunddeckungstyp(String id, String kindId, String versionId) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(), id, kindId,
					versionId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return targetBuilder;
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp mit einem
		 * Produktbaustein und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungstypBuilder hausratGrunddeckungstyp(String productCmptId,
				CardinalityRange cardinality) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(),
					productCmptId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return targetBuilder;
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp und setzt diese als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratGrunddeckungstypBuilder hausratGrunddeckungstyp(String id, String kindId, String versionId,
				CardinalityRange cardinality) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(), id, kindId,
					versionId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return targetBuilder;
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratProdukt getResult() {
			return productBuilder.getResult();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected IModifiableRuntimeRepository getRepository() {
			return productBuilder.getRepository();
		}
	}

	/**
	 * Dies ist eine Wrapper-Klasse für die Setter für Assoziationen. Die Methoden
	 * in dieser Klasse geben wieder den ursprünglichen HausratProduktBuilder
	 * zurück.
	 *
	 * @generated
	 */
	public static class AddAssociationBuilder {

		/**
		 * @generated
		 */
		private HausratProduktBuilder productBuilder;

		/**
		 * @generated
		 */
		@IpsGenerated
		protected AddAssociationBuilder(HausratProduktBuilder productBuilder) {
			this.productBuilder = productBuilder;
		}

		/**
		 * Setzt eine existierende Instanz von HausratGrunddeckungstyp als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(HausratGrunddeckungstyp targetProduct) {
			getResult().setHausratGrunddeckungstyp(targetProduct);
			return done();
		}

		/**
		 * Setzt eine existierende Instanz von HausratGrunddeckungstyp als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(HausratGrunddeckungstyp targetProduct,
				CardinalityRange cardinality) {
			getResult().setHausratGrunddeckungstyp(targetProduct, cardinality);
			return done();
		}

		/**
		 * Holt eine Instanz von einer Subklasse von HausratGrunddeckungstyp mit
		 * ProductCmptID und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(HausratGrunddeckungstypBuilder targetBuilder) {
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return done();
		}

		/**
		 * Holt eine Instanz von einer Subklasse von HausratGrunddeckungstyp mit
		 * ProductCmptID und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(HausratGrunddeckungstypBuilder targetBuilder,
				CardinalityRange cardinality) {
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return done();
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp mit einem
		 * Produktbaustein und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(String productCmptId) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(),
					productCmptId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return done();
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp und setzt diese als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(String id, String kindId, String versionId) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(), id, kindId,
					versionId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult());
			return done();
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp mit einem
		 * Produktbaustein und setzt diese als HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(String productCmptId, CardinalityRange cardinality) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(),
					productCmptId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return done();
		}

		/**
		 * Erstellt eine neue Instanz von HausratGrunddeckungstyp und setzt diese als
		 * HausratGrunddeckungstyp.
		 *
		 * @generated
		 */
		@IpsGenerated
		public HausratProduktBuilder hausratGrunddeckungstyp(String id, String kindId, String versionId,
				CardinalityRange cardinality) {
			HausratGrunddeckungstypBuilder targetBuilder = HausratGrunddeckungstyp.builder(getRepository(), id, kindId,
					versionId);
			getResult().setHausratGrunddeckungstyp(targetBuilder.getResult(), cardinality);
			return done();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratProduktBuilder done() {
			return productBuilder;
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected HausratProdukt getResult() {
			return productBuilder.getResult();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		protected IModifiableRuntimeRepository getRepository() {
			return productBuilder.getRepository();
		}
	}

}
