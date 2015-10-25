package org.swtk.commons.dict.wiktionary.generated.e.r.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryERG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ergasiophygophyte", "{\"term\":\"ergasiophygophyte\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Ancient greek (to 1453) {{m|grc|ἐργᾰσίᾱ||work, production}} + {{m|grc|φῠγή||flight}} {{suffix||phyte|t2\u003dplant|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any formerly cultivated plant that has escaped into the wild\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergativity", "{\"term\":\"ergativity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|ergative|ity|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A structuring property of the grammar of certain languages consisting in the differential treatment given to \u0027A\u0027 (the subject of transitive verbs), in contrast to \u0027O\u0027 (the object of transitive verbs) and \u0027S\u0027 (the subject of intransitive verbs), which are treated similarly. This differential treatment may take the form of a special case marker (e.g., an affix or a particle) used with A but not with O or S, or of a specific agreement pattern (e.g., the verb may agree in person and number with A, but not with O and S\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergatocracy", "{\"term\":\"ergatocracy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|ergato|cracy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"government by the workers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergot", "{\"term\":\"ergot\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"French\", \"old french (842-ca. 1400)\", \"transalpine gaulish\"], \"text\":\"From French \u0027ergot\u0027 from Old french (842-ca. 1400) \u0027argot\u0027 (spur) possibly of Transalpine gaulish origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any fungus in the genus \u0027Claviceps\u0027 which are parasitic on grasses\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The sclerotium (wintering stage) of certain fungi in the genus \u0027Claviceps\u0027, appearing as a deformed grain in certain cereals and grasses infected by the fungi\", \"priority\":2}]}, \"synonyms\":{}}");

	add("ergocriptine", "{\"term\":\"ergocriptine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular indole alkaloid found in ergot\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergodicity", "{\"term\":\"ergodicity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ergodic|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being ergodi\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The extent to which something is ergodic\", \"priority\":2}]}, \"synonyms\":{}}");

	add("ergogenics", "{\"term\":\"ergogenics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Enhancement of sporting performance\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergometrine", "{\"term\":\"ergometrine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ergoline (and lysergamide) derivative, one of the primary ergot and morning glory alkaloids, chemically similar to LSD and used in medicine to facilitate delivery of the placenta and to prevent bleeding after childbirth\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergosterol", "{\"term\":\"ergosterol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|ergo|sterol|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The steroid precursor of vitamin D2. It is found in cell membranes of fungi, and is their functional equivalent of cholesterol. It is also found in the membranes of some protists\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergotamine", "{\"term\":\"ergotamine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|de|Ergotamin|lang\u003den}}, corresponding to {{suffix|ergot|amine|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alkaloid, extracted from ergot, that causes constriction of blood vessels and has been used to treat migraine; it is related to lysergic acid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ergotine", "{\"term\":\"ergotine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A powerful astringent alkaloid extracted from ergot as a brown, amorphous, bitter substance. It is used to produce contraction of the uterus\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }