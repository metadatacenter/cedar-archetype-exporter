package org.metadatacenter.archetype.exporter;

import generated.TypeAttribute;
import generated.TypeBioSample;
import generated.TypeBioSampleIdentifier;
import generated.TypeContactInfo;
import generated.TypeName;
import generated.TypeOrganization;
import generated.TypeSubmission;

public class CEDARInstanceReader
{
  public static void main(String[] argc) throws IOException, DatatypeConfigurationException
  {
    // Open the JSON file containing the CEDAR template instance
    File submissionInstanceJSONFile = new File(CEDARInstanceReaader.class.getClassLoader()
      .getResource("./json/NCBIBioSampleSubmissionInstance1.json").getFile());

    // Read the instance into the JSONSchema2POJO-generated Java class
    NCBIBioSampleSubmissionTemplate bioSampleSubmissionInstance = mapper
      .readValue(submissionInstanceJSONFile, NCBIBioSampleSubmissionTemplate.class);

    // Nagivate through the Java instance and print out its property values
    NCBISubmissionDescription ncbiSubmissionDescription = bioSampleSubmissionInstance.getNCBISubmissionDescription();

    (ncbiSubmissionDescription.getComment().getValue());
    (ncbiSubmissionDescription.getReleaseDate().getValue());

    NCBIOrganization ncbiOrganization = ncbiSubmissionDescription.getNCBIOrganization();
    setOrganizationName(ncbiOrganization.getInstitutionName().getValue());

    NCBIContact ncbiContact = ncbiOrganization.getNCBIContact();
    (ncbiContact.getEmail().getValue());

    NCBIName ncbiName = ncbiContact.getNCBIName();
    (ncbiName.getFirstName().getValue();
    (ncbiName.getMiddleInitial().getValue());
    (ncbiName.getLastName().getValue());

    BioSample bioSample = bioSampleSubmissionInstance.getBioSample();
    (bioSample.getBioProjectID().getValue());
    (bioSample.getPackage().getValue());

    BioSampleSampleID bioSampleSampleID = bioSample.getBioSampleSampleID();
    (bioSampleSampleID.getLabel().getValue());
    System.out.println("Display: " + bioSampleSampleID.getDisplay().getValue());

    NCBISPUID ncbiSPUID = bioSampleSampleID.getNCBISPUID();
    (ncbiSPUID.getSubmitterID().getValue());
    System.out.println("Namespace: " + ncbiSPUID.getNamespace().getValue());
    System.out.println("Value: " + ncbiSPUID.getValue().getValue());

    BioSampleDescriptor bioSampleDescriptor = bioSample.getBioSampleDescriptor();
    (bioSampleDescriptor.getTitle().getValue());
    (bioSampleDescriptor.getDescription().getValue());
    (bioSampleDescriptor.getExternalLink().getValue());

    NCBIOrganism ncbiOrganism = bioSample.getNCBIOrganism();
    (ncbiOrganism.getOrganismName().getValue());
    System.out.println("Label: " + ncbiOrganism.getLabel().getValue());
    System.out.println("Strain: " + ncbiOrganism.getStrain().getValue());
    System.out.println("Isolate Name: " + ncbiOrganism.getIsolateName().getValue());
    System.out.println("Breed: " + ncbiOrganism.getBreed().getValue());
    System.out.println("Cultivar: " + ncbiOrganism.getCultivar().getValue());

    BioSamplePathogenCl10Attributes bioSamplePathogenCl10Attributes = bioSample.getBioSamplePathogenCl10Attributes();
    ("Strain", bioSamplePathogenCl10Attributes.getStrain().getValue());
    ("Collection Date", bioSamplePathogenCl10Attributes.getCollectionDate().getValue());
    ("Collected By", bioSamplePathogenCl10Attributes.getCollectedBy().getValue());
    ("GEO Location Name", bioSamplePathogenCl10Attributes.getGEOLocationName().getValue());
    ("Isolation Source", bioSamplePathogenCl10Attributes.getIsolationSource().getValue());
    ("Latitude/longitude", bioSamplePathogenCl10Attributes.getLatitudeLongitude().getValue());
    ("Host", bioSamplePathogenCl10Attributes.getHost().getValue());
    ("Host Disease", bioSamplePathogenCl10Attributes.getHostDisease().getValue());

    List<BioSampleAttribute> bioSampleAttributes = bioSample.getBioSampleAttribute();
    for (BioSampleAttribute bioSampleAttribute : bioSampleAttributes) {
      (bioSampleAttribute.getAttributeName().getValue(),
        bioSampleAttribute.getAttributeValue().getValue());
    }
  }
}
