package org.swtk.commons.dict.wiktionary.generated.k.a.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kazakhstan", "{\"term\":\"kazakhstan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\", \"Kazakh\"], \"text\":\"From Kazakh \u0027қазақ|lang\u003dkk\u0027 () + Persian \u0027ستان|lang\u003dfa|sc\u003dfa-arab|tr\u003dstān\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A country in Central Asia. Official name: Republic of Kazakhstan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027 \u0026quot;[http://www.lyricsondemand.com/b/boratlyrics/okazakhstanlyrics.html O Kazakshtan]\u0026quot; (Lyrics) - w:Stereophonic Musical Listenings That Have Been Origin in Moving Film \u0026quot;Borat: Cultural Learnings of America for Make Benefit Glorious Nation of Bora\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Kazakhstan\u0027\u0027 greatest country in the world\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"All other countries are run by little girls\", \"priority\":4}]}, \"synonyms\":{}}");

	add("kazillion", "{\"term\":\"kazillion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See {{suffix||illion|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unspecified large number (of\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kazoo", "{\"term\":\"kazoo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Probably onomatopoeic.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A simple musical instrument (membranophone) consisting of a pipe with a hole in it, producing a buzzing sound when the player hums into it\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }