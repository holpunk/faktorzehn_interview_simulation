package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsAssociations;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.valueset.ValueSet;
import org.faktorips.valueset.UnrestrictedValueSet;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.valueset.OrderedValueSet;
import org.faktorips.runtime.IProductComponentLink;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.faktorips.runtime.model.annotation.IpsDefaultValueSetter;
import org.faktorips.runtime.model.annotation.IpsAllowedValuesSetter;
import org.faktorips.runtime.model.annotation.IpsAssociation;
import org.faktorips.runtime.model.type.AssociationKind;
import org.faktorips.runtime.model.annotation.IpsMatchingAssociation;
import org.faktorips.runtime.model.annotation.IpsAssociationAdder;
import org.faktorips.runtime.internal.ProductComponentLink;
import org.faktorips.runtime.CardinalityRange;
import org.faktorips.runtime.model.annotation.IpsAssociationLinks;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import org.faktorips.runtime.internal.IpsStringUtils;
import org.faktorips.runtime.internal.MultiValueXmlHelper;
import org.faktorips.runtime.internal.EnumValues;
import org.faktorips.valueset.DerivedValueSet;
import org.faktorips.runtime.internal.Range;
import org.faktorips.runtime.IProductComponent;
import java.util.List;
import org.faktorips.values.ListUtil;
import org.faktorips.valueset.IntegerRange;
import org.faktorips.values.Money;
import java.util.ArrayList;
import org.faktorips.runtime.IModifiableRuntimeRepository;
import org.faktorips.runtime.internal.DateTime;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratProdukt.
 *
 * @since 1.0
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratProdukt")
@IpsAttributes({ "produktname", "vorgabeZahlweise", "erlaubteZahlweisen", "wertebereichWohnflaeche",
		"vorschlagVersSummeProQm", "wertebereichVersSumme" })
@IpsAssociations({ "HausratGrunddeckungstyp" })
@IpsConfigures(HausratVertrag.class)
@IpsDocumented(bundleName = "org.faktorips.tutorial.model.model-label-and-descriptions", defaultLocale = "de")
public class HausratProdukt extends ProductComponent {

	/**
	 * Der XML Tag Name der Assoziation hausratGrunddeckungstyp.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private static final String XML_TAG_HAUSRAT_GRUNDDECKUNGSTYP = "HausratGrunddeckungstyp";
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_PRODUKTNAME = "produktname";
	/**
	 * Die maximal erlaubten Werte fuer die Eigenschaft produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("produktname")
	public static final ValueSet<String> MAX_ALLOWED_VALUES_FOR_PRODUKTNAME = new UnrestrictedValueSet<>(true);
	/**
	 * Der Vorgabewert des Attributs produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("produktname")
	public static final String DEFAULT_VALUE_FOR_PRODUKTNAME = null;
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_VORGABEZAHLWEISE = "vorgabeZahlweise";
	/**
	 * Die maximal erlaubten Werte fuer die Eigenschaft vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("vorgabeZahlweise")
	public static final ValueSet<Integer> MAX_ALLOWED_VALUES_FOR_VORGABE_ZAHLWEISE = new UnrestrictedValueSet<>(true);
	/**
	 * Der Vorgabewert des Attributs vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("vorgabeZahlweise")
	public static final Integer DEFAULT_VALUE_FOR_VORGABE_ZAHLWEISE = null;
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_ERLAUBTEZAHLWEISEN = "erlaubteZahlweisen";
	/**
	 * Die maximal erlaubten Werte fuer die Eigenschaft erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("erlaubteZahlweisen")
	public static final ValueSet<Integer> MAX_ALLOWED_VALUES_FOR_ERLAUBTE_ZAHLWEISEN = new UnrestrictedValueSet<>(true);
	/**
	 * Der Vorgabewert des Attributs erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("erlaubteZahlweisen")
	public static final List<Integer> DEFAULT_VALUE_FOR_ERLAUBTE_ZAHLWEISEN = ListUtil.newList(null);
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_WERTEBEREICHWOHNFLAECHE = "wertebereichWohnflaeche";
	/**
	 * Der maximal erlaubte Wertebereich fuer die Eigenschaft
	 * wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("wertebereichWohnflaeche")
	public static final IntegerRange MAX_ALLOWED_RANGE_FOR_WERTEBEREICH_WOHNFLAECHE = IntegerRange
			.valueOf((Integer) null, (Integer) null, (Integer) null, false);
	/**
	 * Der Vorgabewert des Attributs wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("wertebereichWohnflaeche")
	public static final Integer DEFAULT_VALUE_FOR_WERTEBEREICH_WOHNFLAECHE = null;
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_VORSCHLAGVERSSUMMEPROQM = "vorschlagVersSummeProQm";
	/**
	 * Die maximal erlaubten Werte fuer die Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("vorschlagVersSummeProQm")
	public static final ValueSet<Money> MAX_ALLOWED_VALUES_FOR_VORSCHLAG_VERS_SUMME_PRO_QM = new UnrestrictedValueSet<>(
			true);
	/**
	 * Der Vorgabewert des Attributs vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("vorschlagVersSummeProQm")
	public static final Money DEFAULT_VALUE_FOR_VORSCHLAG_VERS_SUMME_PRO_QM = Money.NULL;
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	public static final String PROPERTY_WERTEBEREICHVERSSUMME = "wertebereichVersSumme";
	/**
	 * Die maximal erlaubten Werte fuer die Eigenschaft wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("wertebereichVersSumme")
	public static final ValueSet<Money> MAX_ALLOWED_VALUES_FOR_WERTEBEREICH_VERS_SUMME = new UnrestrictedValueSet<>(
			true);
	/**
	 * Der Vorgabewert des Attributs wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("wertebereichVersSumme")
	public static final List<Money> DEFAULT_VALUE_FOR_WERTEBEREICH_VERS_SUMME = ListUtil.newList(Money.NULL);
	/**
	 * Membervariable für die Produkteigenschaft Produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private String produktname = DEFAULT_VALUE_FOR_PRODUKTNAME;

	/**
	 * Membervariable für die Produkteigenschaft VorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private Integer vorgabeZahlweise = DEFAULT_VALUE_FOR_VORGABE_ZAHLWEISE;
	/**
	 * Membervariable für die Produkteigenschaft ErlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private List<Integer> erlaubteZahlweisen = DEFAULT_VALUE_FOR_ERLAUBTE_ZAHLWEISEN;
	/**
	 * Membervariable für die Produkteigenschaft WertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private Integer wertebereichWohnflaeche = DEFAULT_VALUE_FOR_WERTEBEREICH_WOHNFLAECHE;
	/**
	 * Membervariable für die Produkteigenschaft VorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private Money vorschlagVersSummeProQm = DEFAULT_VALUE_FOR_VORSCHLAG_VERS_SUMME_PRO_QM;
	/**
	 * Membervariable für die Produkteigenschaft WertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private List<Money> wertebereichVersSumme = DEFAULT_VALUE_FOR_WERTEBEREICH_VERS_SUMME;
	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft zahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private Integer defaultValueZahlweise = Integer.valueOf("0");
	/**
	 * Instanzvariable fuer den Wertebereich des Attributs zahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private OrderedValueSet<Integer> allowedValuesForZahlweise = HausratVertrag.MAX_ALLOWED_VALUES_FOR_ZAHLWEISE;

	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft wohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private Integer defaultValueWohnflaeche = Integer.valueOf("0");
	/**
	 * Instanzvariable fuer die erlaubte Wertemenge des Attributs wohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private ValueSet<Integer> setOfAllowedValuesWohnflaeche = HausratVertrag.MAX_ALLOWED_VALUES_FOR_WOHNFLAECHE;

	/**
	 * Membervariable fuer die Beziehung HausratGrunddeckungstyp.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	private IProductComponentLink<HausratGrunddeckungstyp> hausratGrunddeckungstyp = null;

	/**
	 * Erzeugt eine neue Instanz von HausratProdukt.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProdukt(IRuntimeRepository repository, String id, String kindId, String versionId) {
		super(repository, id, kindId, versionId);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public boolean isChangingOverTime() {
		return false;
	}

	/**
	 * Gibt den Wert der Eigenschaft produktname zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "produktname", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public String getProduktname() {
		return produktname;
	}

	/**
	 * Setzt den Wert der Eigenschaft produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("produktname")
	@IpsGenerated
	public void setProduktname(String newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setProduktnameInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft produktname.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setProduktnameInternal(String newValue) {
		this.produktname = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft vorgabeZahlweise zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "vorgabeZahlweise", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Integer getVorgabeZahlweise() {
		return vorgabeZahlweise;
	}

	/**
	 * Setzt den Wert der Eigenschaft vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("vorgabeZahlweise")
	@IpsGenerated
	public void setVorgabeZahlweise(Integer newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setVorgabeZahlweiseInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft vorgabeZahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setVorgabeZahlweiseInternal(Integer newValue) {
		this.vorgabeZahlweise = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft erlaubteZahlweisen zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "erlaubteZahlweisen", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public List<Integer> getErlaubteZahlweisen() {
		return new ArrayList<>(erlaubteZahlweisen);
	}

	/**
	 * Setzt den Wert der Eigenschaft erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("erlaubteZahlweisen")
	@IpsGenerated
	public void setErlaubteZahlweisen(List<Integer> newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setErlaubteZahlweisenInternal(new ArrayList<>(newValue));
	}

	/**
	 * Setzt den Wert der Eigenschaft erlaubteZahlweisen.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setErlaubteZahlweisenInternal(List<Integer> newValue) {
		this.erlaubteZahlweisen = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft wertebereichWohnflaeche zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "wertebereichWohnflaeche", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.Range)
	@IpsGenerated
	public Integer getWertebereichWohnflaeche() {
		return wertebereichWohnflaeche;
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("wertebereichWohnflaeche")
	@IpsGenerated
	public void setWertebereichWohnflaeche(Integer newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setWertebereichWohnflaecheInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichWohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setWertebereichWohnflaecheInternal(Integer newValue) {
		this.wertebereichWohnflaeche = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft vorschlagVersSummeProQm zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "vorschlagVersSummeProQm", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getVorschlagVersSummeProQm() {
		return vorschlagVersSummeProQm;
	}

	/**
	 * Setzt den Wert der Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("vorschlagVersSummeProQm")
	@IpsGenerated
	public void setVorschlagVersSummeProQm(Money newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setVorschlagVersSummeProQmInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setVorschlagVersSummeProQmInternal(Money newValue) {
		this.vorschlagVersSummeProQm = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft wertebereichVersSumme zurück.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttribute(name = "wertebereichVersSumme", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public List<Money> getWertebereichVersSumme() {
		return new ArrayList<>(wertebereichVersSumme);
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAttributeSetter("wertebereichVersSumme")
	@IpsGenerated
	public void setWertebereichVersSumme(List<Money> newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setWertebereichVersSummeInternal(new ArrayList<>(newValue));
	}

	/**
	 * Setzt den Wert der Eigenschaft wertebereichVersSumme.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setWertebereichVersSummeInternal(List<Money> newValue) {
		this.wertebereichVersSumme = newValue;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft zahlweise zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("zahlweise")
	@IpsGenerated
	public Integer getDefaultValueZahlweise() {
		return defaultValueZahlweise;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft zahlweise.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("zahlweise")
	@IpsGenerated
	public void setDefaultValueZahlweise(Integer defaultValueZahlweise) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueZahlweise = defaultValueZahlweise;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut zahlweise zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("zahlweise")
	@IpsGenerated
	public ValueSet<Integer> getAllowedValuesForZahlweise() {
		return allowedValuesForZahlweise;
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
	@IpsAllowedValuesSetter("zahlweise")
	@IpsGenerated
	public void setAllowedValuesForZahlweise(ValueSet<Integer> allowedValuesForZahlweise) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.allowedValuesForZahlweise = (OrderedValueSet<Integer>) allowedValuesForZahlweise;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft wohnflaeche zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValue("wohnflaeche")
	@IpsGenerated
	public Integer getDefaultValueWohnflaeche() {
		return defaultValueWohnflaeche;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft wohnflaeche.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("wohnflaeche")
	@IpsGenerated
	public void setDefaultValueWohnflaeche(Integer defaultValueWohnflaeche) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueWohnflaeche = defaultValueWohnflaeche;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut wohnflaeche zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAllowedValues("wohnflaeche")
	@IpsGenerated
	public ValueSet<Integer> getAllowedValuesForWohnflaeche() {
		return setOfAllowedValuesWohnflaeche;
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
	@IpsAllowedValuesSetter("wohnflaeche")
	@IpsGenerated
	public void setAllowedValuesForWohnflaeche(ValueSet<Integer> setOfAllowedValuesWohnflaeche) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.setOfAllowedValuesWohnflaeche = setOfAllowedValuesWohnflaeche;
	}

	/**
	 * Gibt HausratGrunddeckungstyp zurueck. bzw. <code>null</code>, wenn kein
	 * HausratGrunddeckungstyp referenziert wird.
	 *
	 * @throws org.faktorips.runtime.ProductCmptNotFoundException wenn ein Baustein
	 *                                                            referenziert ist,
	 *                                                            dieser aber nicht
	 *                                                            gefunden wird.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAssociation(name = "HausratGrunddeckungstyp", pluralName = "HausratGrunddeckungstypen", kind = AssociationKind.Composition, targetClass = HausratGrunddeckungstyp.class, min = 1, max = 1)
	@IpsMatchingAssociation(source = HausratVertrag.class, name = "HausratGrunddeckung")
	@IpsGenerated
	public HausratGrunddeckungstyp getHausratGrunddeckungstyp() {
		if (hausratGrunddeckungstyp != null && !hausratGrunddeckungstyp.getCardinality().isEmpty()) {
			return hausratGrunddeckungstyp.getTarget();
		}
		return null;
	}

	/**
	 * Setzt das neue referenzierte HausratGrunddeckungstyp-Objekt.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratGrunddeckungstyp")
	@IpsGenerated
	public void setHausratGrunddeckungstyp(HausratGrunddeckungstyp target) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		hausratGrunddeckungstyp = (target == null ? null
				: new ProductComponentLink<>(this, target, "HausratGrunddeckungstyp"));
	}

	/**
	 * Setzt das neue referenzierte HausratGrunddeckungstyp-Objekt mit der gegebenen
	 * Kardinalitaet.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratGrunddeckungstyp", withCardinality = true)
	@IpsGenerated
	public void setHausratGrunddeckungstyp(HausratGrunddeckungstyp target, CardinalityRange cardinality) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		hausratGrunddeckungstyp = (target == null ? null
				: new ProductComponentLink<>(this, target, cardinality, "HausratGrunddeckungstyp"));
	}

	/**
	 * Gibt den <code>ILink</code> zu HausratGrunddeckungstyp zurueck. bzw.
	 * <code>null</code>, wenn kein Objekt referenziert wird.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsAssociationLinks(association = "HausratGrunddeckungstyp")
	@IpsGenerated
	public IProductComponentLink<HausratGrunddeckungstyp> getLinkForHausratGrunddeckungstyp() {
		return hausratGrunddeckungstyp;
	}

	/**
	 * Gibt den <code>ILink</code> zu HausratGrunddeckungstyp an dem angegebenen
	 * Index zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public IProductComponentLink<HausratGrunddeckungstyp> getLinkForHausratGrunddeckungstyp(
			HausratGrunddeckungstyp productComponent) {
		return hausratGrunddeckungstyp != null && hausratGrunddeckungstyp.getTargetId().equals(productComponent.getId())
				? hausratGrunddeckungstyp
				: null;
	}

	/**
	 * Gibt die Kardinalitaet fuer die Beziehung mit den Rollennamen
	 * HausratGrunddeckung zurueck.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public CardinalityRange getCardinalityForHausratGrunddeckung(HausratGrunddeckungstyp productCmpt) {
		if (productCmpt != null) {
			return hausratGrunddeckungstyp != null && hausratGrunddeckungstyp.getTargetId().equals(productCmpt.getId())
					? hausratGrunddeckungstyp.getCardinality()
					: null;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitPropertiesFromXml(Map<String, Element> configMap) {
		super.doInitPropertiesFromXml(configMap);
		doInitProduktname(configMap);
		doInitVorgabeZahlweise(configMap);
		doInitErlaubteZahlweisen(configMap);
		doInitWertebereichWohnflaeche(configMap);
		doInitVorschlagVersSummeProQm(configMap);
		doInitWertebereichVersSumme(configMap);
		doInitZahlweise(configMap);
		doInitWohnflaeche(configMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitProduktname(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_PRODUKTNAME);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.produktname = value;
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitVorgabeZahlweise(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_VORGABEZAHLWEISE);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.vorgabeZahlweise = IpsStringUtils.isEmpty(value) ? null : Integer.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitErlaubteZahlweisen(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_ERLAUBTEZAHLWEISEN);
		if (configElement != null) {
			List<Integer> valueList = new ArrayList<>();
			List<String> stringList = MultiValueXmlHelper.getValuesFromXML(configElement);
			for (String stringValue : stringList) {
				Integer convertedValue = IpsStringUtils.isEmpty(stringValue) ? null : Integer.valueOf(stringValue);
				valueList.add(convertedValue);
			}
			this.erlaubteZahlweisen = valueList;
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitWertebereichWohnflaeche(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_WERTEBEREICHWOHNFLAECHE);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.wertebereichWohnflaeche = IpsStringUtils.isEmpty(value) ? null : Integer.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitVorschlagVersSummeProQm(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_VORSCHLAGVERSSUMMEPROQM);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.vorschlagVersSummeProQm = Money.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitWertebereichVersSumme(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_WERTEBEREICHVERSSUMME);
		if (configElement != null) {
			List<Money> valueList = new ArrayList<>();
			List<String> stringList = MultiValueXmlHelper.getValuesFromXML(configElement);
			for (String stringValue : stringList) {
				Money convertedValue = Money.valueOf(stringValue);
				valueList.add(convertedValue);
			}
			this.wertebereichVersSumme = valueList;
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitZahlweise(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratVertrag.PROPERTY_ZAHLWEISE);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueZahlweise = IpsStringUtils.isEmpty(value) ? null : Integer.valueOf(value);
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratVertrag.PROPERTY_ZAHLWEISE);
		if (valueSetElement != null) {
			EnumValues values = ValueToXmlHelper.getEnumValueSetFromElement(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (values != null) {
				List<Integer> enumValues = new ArrayList<>();
				for (int i = 0; i < values.getNumberOfValues(); i++) {
					enumValues.add(
							IpsStringUtils.isEmpty(values.getValue(i)) ? null : Integer.valueOf(values.getValue(i)));
				}
				allowedValuesForZahlweise = new OrderedValueSet<>(enumValues, values.containsNull(), null);
			}
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitWohnflaeche(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratVertrag.PROPERTY_WOHNFLAECHE);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueWohnflaeche = IpsStringUtils.isEmpty(value) ? null : Integer.valueOf(value);
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratVertrag.PROPERTY_WOHNFLAECHE);
		if (valueSetElement != null) {
			setOfAllowedValuesWohnflaeche = new DerivedValueSet<>();
			EnumValues values = ValueToXmlHelper.getEnumValueSetFromElement(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (values != null) {
				List<Integer> enumValues = new ArrayList<>();
				for (int i = 0; i < values.getNumberOfValues(); i++) {
					enumValues.add(
							IpsStringUtils.isEmpty(values.getValue(i)) ? null : Integer.valueOf(values.getValue(i)));
				}
				setOfAllowedValuesWohnflaeche = new OrderedValueSet<>(enumValues, values.containsNull(), null);
			}
			Range range = ValueToXmlHelper.getRangeFromElement(valueSetElement, ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (range != null) {
				if (range.isEmpty()) {
					setOfAllowedValuesWohnflaeche = IntegerRange.empty();
				} else {
					setOfAllowedValuesWohnflaeche = IntegerRange.valueOf(range.getLower(), range.getUpper(),
							range.getStep(), range.containsNull());
				}
			}
		}
	}

	/**
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitReferencesFromXml(Map<String, List<Element>> elementsMap) {
		super.doInitReferencesFromXml(elementsMap);
		doInitHausratGrunddeckungstyp(elementsMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitHausratGrunddeckungstyp(Map<String, List<Element>> elementsMap) {
		List<Element> associationElements = elementsMap.get(XML_TAG_HAUSRAT_GRUNDDECKUNGSTYP);
		if (associationElements != null) {
			for (Element element : associationElements) {
				if (!"0".equals(element.getAttribute("maxCardinality"))) {
					hausratGrunddeckungstyp = new ProductComponentLink<>(this);
					hausratGrunddeckungstyp.initFromXml(element);
				}
			}
		}
	}

	/**
	 * Erzeugt eine neue Instanz von HausratVertrag, die durch diesen
	 * Produktbaustein konfiguriert wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag createHausratVertrag() {
		HausratVertrag policy = new HausratVertrag(this);
		policy.initialize();
		return policy;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public HausratVertrag createPolicyComponent() {
		return createHausratVertrag();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public IProductComponentLink<? extends IProductComponent> getLink(String linkName, IProductComponent target) {
		if ("HausratGrunddeckungstyp".equals(linkName)) {
			return getLinkForHausratGrunddeckungstyp((HausratGrunddeckungstyp) target);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public List<IProductComponentLink<? extends IProductComponent>> getLinks() {
		List<IProductComponentLink<? extends IProductComponent>> list = new ArrayList<>();
		if (getLinkForHausratGrunddeckungstyp() != null) {
			list.add(getLinkForHausratGrunddeckungstyp());
		}
		return list;
	}

	/**
	 * Erzeugt ein neues HausratProduktBuilder um dieses Produkt zu bearbeiten.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProduktBuilder modify() {
		return HausratProduktBuilder.from(this, (IModifiableRuntimeRepository) this.getRepository());
	}

	/**
	 * Erzeugt eine neue Instanz von HausratProdukt mit einem
	 * {@link IModifiableRuntimeRepository}, ID, kindID und versionID. Das
	 * Wirksamkeitsdatum der neuen Instanz wird auf 1900/1/1 gesetzt.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratProduktBuilder builder(IModifiableRuntimeRepository runtimeRepository, String id,
			String kindId, String versionId) {
		HausratProdukt product = new HausratProdukt(runtimeRepository, id, kindId, versionId);
		product.setValidFrom(new DateTime(1900, 1, 1));
		runtimeRepository.putProductComponent(product);

		return new HausratProduktBuilder(product, runtimeRepository);
	}

	/**
	 * Erzeugt eine neue Instanz von HausratProdukt mit einem
	 * {@link IModifiableRuntimeRepository}, ID, kindID und versionID.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratProduktBuilder builder(IModifiableRuntimeRepository runtimeRepository, String id,
			String kindId, String versionId, DateTime validFrom) {
		HausratProdukt product = new HausratProdukt(runtimeRepository, id, kindId, versionId);
		product.setValidFrom(validFrom);
		runtimeRepository.putProductComponent(product);

		return new HausratProduktBuilder(product, runtimeRepository);
	}

	/**
	 * Erzeugt eine neue Instanz von HausratProdukt mit dem ID von einem
	 * existierenden Produktbaustein.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratProduktBuilder builder(IModifiableRuntimeRepository runtimeRepository, String prodCmptId) {
		HausratProdukt product = (HausratProdukt) runtimeRepository.getProductComponent(prodCmptId);

		if (product == null) {
			throw new RuntimeException("Keinen Produktbaustein mit der gegebenden ID gefunden!");
		} else {
			return HausratProduktBuilder.from(product, runtimeRepository);
		}
	}
}
