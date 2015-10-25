package org.swtk.commons.dict.wiktionary.generated.k.m.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKME000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kmet", "{\"term\":\"kmet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Serbo-Croatian\"], \"text\":\"From Serbo-croatian \u0027kmet\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A serf on the Balkan peninsula, especially one holding land under the estate system introduced by the Ottomans and retained in some areas by Austria-Hungary\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1876\u0027\u0027, \u0027Through Bosnia and Herzegovina On Foot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Suffering from this double disability, social and religious, the Christian ‘\u0027\u0027\u0027kmet\u0027\u0027\u0027,’ or tiller of the soil, is worse off than many a serf in our darkest ages, and lies as completely at the mercy of the Mahometan owner of the soil as if he were a slave\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Michael Palairet, \u0027The Balkan Economies c. 1800-1914\u0027, Cambridge 2002, p. 206\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The authorities repeatedly emphasized that the \u0027\u0027\u0027kmet\u0027\u0027\u0027 was not bound to his master, to counter allegations equating \u0027\u0027\u0027kmet\u0027\u0027\u0027 tenure with servile status\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0027The Sleepwalkers\u0027, Penguin 2013, p. 74\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"In any case, the Serbian \u0027\u0027\u0027kmets\u0027\u0027\u0027 who remained within the old estate system on the eve of the First World War were not especially badly off by the standards of early twentieth-century peasant Europe […\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }