/*
 * Copyright (C) 2017 OpenDiabetes
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.opendiabetes.vault.plugin.importer.MyPluginPkg;

import com.csvreader.CsvReader;
import de.opendiabetes.vault.container.VaultEntry;
import de.opendiabetes.vault.plugin.importer.CSVImporter;
import de.opendiabetes.vault.plugin.importer.validator.NonValidator;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.util.List;
import java.util.Properties;

//TODO extensive documentation
/**
 * Wrapper class for the MyImporter plugin.
 *
 * @author Magnus Gärtner
 */
public class MyImporter extends Plugin {

    //TODO extensive documentation
    /**
     * Constructor for the PluginManager.
     *
     * @param wrapper The PluginWrapper.
     */
    public MyImporter(final PluginWrapper wrapper) {
        super(wrapper);
    }

    //TODO extensive documentation
    /**
     * Actual implementation of the Medtronic importer plugin.
     */
    @Extension
    public static class MyImporterImplementation extends CSVImporter {
        //TODO extensive documentation
        /**
         * Constructor.
         */
        public MyImporterImplementation() {
            super(new NonValidator());
            notifyStatus(0,"MyImporter is loaded");
        }


        //TODO extensive documentation
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean loadConfiguration(final Properties configuration) {
            System.out.println("MyImporter is loading his configuration");
            return super.loadConfiguration(configuration);
        }


         //TODO extensive documentation
        @Override
        protected void preprocessingIfNeeded(final String filePath) {System.out.println("MyImporter is preprocessing"); }

        //TODO extensive documentation
        /**
         * Parser for medtronic CSV Data.
         *
         * @param creader The CSV reader.
         * @return List of VaultEntry holding the parsed data.
         * @throws Exception If medtronic CSV file can not be parsed.
         */
        @Override
        protected List<VaultEntry> parseEntry(final CsvReader creader) throws Exception {
            System.out.println("MyImporter is parsing an entry");
            return null;
        }
    }

}
