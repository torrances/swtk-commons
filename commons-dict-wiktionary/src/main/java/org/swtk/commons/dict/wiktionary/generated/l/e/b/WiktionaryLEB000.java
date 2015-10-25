package org.swtk.commons.dict.wiktionary.generated.l.e.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("leban", "{\"term\":\"leban\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{l|ar|لَبَن}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Coagulated sour milk diluted with water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Yoghurt\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A fermented liquor made with coagulated sour milk\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lebanese", "{\"term\":\"lebanese\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Lebanon|ese|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person from Lebanon or of Lebanese descent\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lebanon", "{\"term\":\"lebanon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Country in the Middle East. Official name: Republic of Lebanon. Also (especially formerly) known as \u0026quot;the Lebanon\u0026quot\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lebensraum", "{\"term\":\"lebensraum\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From the German \u0027lebensraum\u0027 (living space) from \u0027lebens\u0027 (of life) (the genitive of \u0027leben\u0027 (life) + \u0027raum\u0027 (space)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Territories considered appropriate for German annexation, regarded as vital for the natural flourishing of the German race\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an empire in the form of overseas colonies, in imitation of contemporary powers such as Britain and France\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a Großdeutschland\u0027 obtained through Endoeuropean expansion, usually with a focus upon \u0027w:Drang nach Drang nach Osten\u0027, and varying in its scope from the comparatively modest annexation of the w:Polish Border Polish Border Strip to overlordship of the European continent by the conquest of Russian lands as far as the Urals\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }