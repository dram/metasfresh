/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2020 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.cucumber.stepdefs;

import de.metas.contracts.FlatrateTransitionId;
import de.metas.location.CountryId;
import de.metas.organization.OrgId;
import de.metas.product.ProductCategoryId;
import de.metas.tax.api.TaxCategoryId;
import de.metas.uom.UomId;
import org.adempiere.warehouse.WarehouseId;

public class StepDefConstants
{
	public static final String TABLECOLUMN_IDENTIFIER = "Identifier";

	public static final WarehouseId WAREHOUSE_ID = WarehouseId.ofRepoId(540008);
	public static final OrgId ORG_ID = OrgId.ofRepoId(1000000);
	public static final CountryId COUNTRY_ID = CountryId.ofRepoId(101);
	public static final FlatrateTransitionId FLATRATE_TRANSITION_ID = FlatrateTransitionId.ofRepoId(1000003);
	public static final ProductCategoryId PRODUCT_CATEGORY_STANDARD_ID = ProductCategoryId.ofRepoId(1000000);
	public static final UomId PCE_UOM_ID = UomId.ofRepoId(100);
	public static final TaxCategoryId TAX_CATEGORY_ID_NORMAL = TaxCategoryId.ofRepoId(1000009);
}
