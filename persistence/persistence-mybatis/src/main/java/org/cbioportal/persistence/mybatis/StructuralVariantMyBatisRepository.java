/*
 * Copyright (c) 2018 The Hyve B.V.
 * This code is licensed under the GNU Affero General Public License (AGPL),
 * version 3, or (at your option) any later version.
 */

/*
 * This file is part of cBioPortal.
 *
 * cBioPortal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.cbioportal.persistence.mybatis;

import org.cbioportal.model.GeneFilterQuery;
import org.cbioportal.model.StructuralVariant;
import org.cbioportal.persistence.StructuralVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StructuralVariantMyBatisRepository implements StructuralVariantRepository {

    @Autowired
    private StructuralVariantMapper structuralVariantMapper;

    @Override
    public List<StructuralVariant> fetchStructuralVariants(List<String> molecularProfileIds,
            List<Integer> entrezGeneIds, List<String> sampleIds) {

        return structuralVariantMapper.fetchStructuralVariants(molecularProfileIds, entrezGeneIds, sampleIds);
    }

    @Override
    public List<StructuralVariant> fetchStructuralVariantsByGeneQueries(List<String> molecularProfileIds,
            List<GeneFilterQuery> geneQueries, List<String> sampleIds) {
        return structuralVariantMapper.fetchStructuralVariantsByGeneQueries(molecularProfileIds, geneQueries, sampleIds);
    }
}
