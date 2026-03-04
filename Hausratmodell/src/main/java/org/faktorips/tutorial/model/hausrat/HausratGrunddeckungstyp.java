package org.faktorips.tutorial.model.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.runtime.IRuntimeRepository;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.IModifiableRuntimeRepository;
import org.faktorips.runtime.internal.DateTime;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratGrunddeckungstyp.
 *
 * @since 1.0
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratGrunddeckungstyp")
@IpsConfigures(HausratGrunddeckung.class)
@IpsDocumented(bundleName = "org.faktorips.tutorial.model.model-label-and-descriptions", defaultLocale = "de")
public class HausratGrunddeckungstyp extends ProductComponent {

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstyp.
	 *
	 * @since 1.0
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungstyp(IRuntimeRepository repository, String id, String kindId, String versionId) {
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
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitPropertiesFromXml(Map<String, Element> configMap) {
		super.doInitPropertiesFromXml(configMap);
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckung, die durch diesen
	 * Produktbaustein konfiguriert wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung createHausratGrunddeckung() {
		HausratGrunddeckung policy = new HausratGrunddeckung(this);
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
	public HausratGrunddeckung createPolicyComponent() {
		return createHausratGrunddeckung();
	}

	/**
	 * Erzeugt ein neues HausratGrunddeckungstypBuilder um dieses Produkt zu
	 * bearbeiten.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungstypBuilder modify() {
		return HausratGrunddeckungstypBuilder.from(this, (IModifiableRuntimeRepository) this.getRepository());
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstyp mit einem
	 * {@link IModifiableRuntimeRepository}, ID, kindID und versionID. Das
	 * Wirksamkeitsdatum der neuen Instanz wird auf 1900/1/1 gesetzt.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungstypBuilder builder(IModifiableRuntimeRepository runtimeRepository, String id,
			String kindId, String versionId) {
		HausratGrunddeckungstyp product = new HausratGrunddeckungstyp(runtimeRepository, id, kindId, versionId);
		product.setValidFrom(new DateTime(1900, 1, 1));
		runtimeRepository.putProductComponent(product);

		return new HausratGrunddeckungstypBuilder(product, runtimeRepository);
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstyp mit einem
	 * {@link IModifiableRuntimeRepository}, ID, kindID und versionID.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungstypBuilder builder(IModifiableRuntimeRepository runtimeRepository, String id,
			String kindId, String versionId, DateTime validFrom) {
		HausratGrunddeckungstyp product = new HausratGrunddeckungstyp(runtimeRepository, id, kindId, versionId);
		product.setValidFrom(validFrom);
		runtimeRepository.putProductComponent(product);

		return new HausratGrunddeckungstypBuilder(product, runtimeRepository);
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstyp mit dem ID von einem
	 * existierenden Produktbaustein.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static HausratGrunddeckungstypBuilder builder(IModifiableRuntimeRepository runtimeRepository,
			String prodCmptId) {
		HausratGrunddeckungstyp product = (HausratGrunddeckungstyp) runtimeRepository.getProductComponent(prodCmptId);

		if (product == null) {
			throw new RuntimeException("Keinen Produktbaustein mit der gegebenden ID gefunden!");
		} else {
			return HausratGrunddeckungstypBuilder.from(product, runtimeRepository);
		}
	}
}
