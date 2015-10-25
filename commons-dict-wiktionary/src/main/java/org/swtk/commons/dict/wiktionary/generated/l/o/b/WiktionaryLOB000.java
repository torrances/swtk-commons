package org.swtk.commons.dict.wiktionary.generated.l.o.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lobber", "{\"term\":\"lobber\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who throws or hits/kicks a ball in a high arc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobbyist", "{\"term\":\"lobbyist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|lobby|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person remunerated to persuade (to lobby) politicians to vote in a certain way or otherwise use their office to effect a desired result\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobectomy", "{\"term\":\"lobectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lobe|ectomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The surgical removal of a lobe from an organ such as the lung or the brain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobola", "{\"term\":\"lobola\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Xhosa\", \"Zulu\"], \"text\":\"From Xhosa \u0027lobola\u0027 Zulu \u0027lobola\u0027 (pay dowry)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The dowry paid to a bride\u0027s family to secure a wedding among certain Bantu peoples of South Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1979\u0027\u0027, \u0027A Dry White Season\u0027, Vintage 1998, p. 38\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"All the money he\u0027d brought with him had gone into \u0027\u0027\u0027lobola\u0027\u0027\u0027 – the dowry for a wife […\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1994\u0027\u0027, \u0027Long Walk to Freedom\u0027, Abacus 2010, p. 213\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"My sister Baliwe, who was older than Mabel, had been engaged to be married, and \u0027\u0027\u0027lobola\u0027\u0027\u0027 had already been paid\", \"priority\":5}]}, \"synonyms\":{}}");

	add("lobomycosis", "{\"term\":\"lobomycosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Discovered by Brazilian dermatologist Jorge Lobo.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A blastomycosis of the skin caused by \u0027Lacazia loboi\u0027 (formerly \u0027Loboa loboi\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobscouser", "{\"term\":\"lobscouser\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lobscouse|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sailor\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobsterette", "{\"term\":\"lobsterette\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lobster|ette|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various small lobsters\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lobule", "{\"term\":\"lobule\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small lobe; a subdivision of a lobe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"In liverworts with bilobed leaves, the smaller of the two lobes, sometimes modified to form a sac\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Jubulaceae have a leaf whose \u0027\u0027lobule\u0027\u0027, usually transformed into a water-sac, is normally very narrowly attached to the stem and to the dorsal lobe; indeed some \u0027Frullania\u0027 taxa reproduce vegetatively by dropping the dorsal lobes, but not the \u0027\u0027lobules\u0027\u0027, and \u0027Neohattoria\u0027 has caducous \u0027\u0027lobules\u0027\u0027 but persistent lobes\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }