package org.swtk.commons.dict.wiktionary.generated.s.a.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySAP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sapan", "{\"term\":\"sapan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Malay\"], \"text\":\"From Malay \u0027sepang\u0027 from Proto-malayic {{m|poz-mly-pro|*səpaŋ}}, from Proto-malayo-polynesian {{m|poz-pro|*səpaŋ}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A wood producing a red dye, usually species \u0027Caesalpinia sappan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("saphead", "{\"term\":\"saphead\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A simpleton, a stupid person\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sapling", "{\"term\":\"sapling\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|sap|ling|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A young tree, but bigger than a seedling\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A youngster, especially a male nearing maturity\", \"priority\":2}]}, \"synonyms\":{}}");

	add("saponin", "{\"term\":\"saponin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|sapon|in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various steroid glycosides found in plant tissues that dissolve in water to give a soapy froth\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sapper", "{\"term\":\"sapper\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027sappeur\u0027 (French \u0027sapeur\u0027 . Surface etymology is {{suffix|sap|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who saps; specifically, one who is employed in working at saps, building and repairing fortifications, and the like. Often known as a \u0027combat engineer\u0027 or \u0027military engineer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an officer or private of the Royal Engineers\", \"priority\":2}]}, \"synonyms\":{}}");

	add("sapphirine", "{\"term\":\"sapphirine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|sapphire|ine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rare silicate of magnesium and aluminium (with iron as a major impurity), named for its sapphirelike colour\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sapphism", "{\"term\":\"sapphism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"w:Sappho|Sappho, a poet of the isle of Lesbos (612 {{B.C.E.}} - 570 {{B.C.E.}}) + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lesbianism; female homosexuality\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sapropel", "{\"term\":\"sapropel\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"From German \u0027\u0027 corresponding to \u0027\u0027 + Ancient greek (to 1453) \u0027πηλός\u0027 (mud, clay)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An aquatic sludge-like sediment rich in organic matter formed in oxygen-free areas at the bottom of lakes, seas etc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0027The Origin of Our Species\u0027, Penguin 2012, p. 47\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Another instance in which Mediterranean \u0027\u0027sapropels\u0027\u0027 have provided clues about events deep within the African continent is the ‘greening’ of the Sahara about 120,000 years ago\", \"priority\":3}]}, \"synonyms\":{}}");

	add("saprophyte", "{\"term\":\"saprophyte\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|sapro|phyte|gloss1\u003dputrid matter|gloss2\u003dplant, growth|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any organism that lives on dead organic matter, as certain fungi and bacteria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sapsucker", "{\"term\":\"sapsucker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|sap|sucker|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woodpecker of the eastern United States (of the genus \u0027Sphyrapicus\u0027) that feeds mainly on the sap of tree\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any woodpecker that punctures the bark of trees and feeds upon the sap\", \"priority\":2}]}, \"synonyms\":{}}");

	add("sapwood", "{\"term\":\"sapwood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|sap|wood|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Image:Taxus 150px|thumb|right|A section of a Yew showing 27 annual growth rings, pale sapwood and dark heartwood, and pith (centre dark spot). The dark radial lines are small knots\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The wood just under the bark of a stem or branch, different in color from the heartwood\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A popular myth is that sapwood is not as strong as heartwood\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }