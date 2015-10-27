package org.swtk.commons.dict.wordnet.index.name.instance.t.r.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTROU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"troubadour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10118862\"]}");
	add("{\"term\":\"trouble\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"14070233\", \"07539481\", \"00625102\", \"07303737\", \"07387165\", \"05695143\"]}");
	add("{\"term\":\"troublemaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10750901\"]}");
	add("{\"term\":\"troubler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10750901\"]}");
	add("{\"term\":\"troubleshooter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10751217\"]}");
	add("{\"term\":\"troublesomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04718711\"]}");
	add("{\"term\":\"trough\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03722670\", \"04495683\", \"13379064\", \"13916387\", \"03476596\", \"09485903\"]}");
	add("{\"term\":\"trouncing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01163216\", \"07491763\"]}");
	add("{\"term\":\"troupe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08203951\"]}");
	add("{\"term\":\"trouper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09859438\", \"10750272\"]}");
	add("{\"term\":\"trouser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04495786\"]}");
	add("{\"term\":\"trousering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03890891\"]}");
	add("{\"term\":\"trousers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04496264\"]}");
	add("{\"term\":\"trousseau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04496990\"]}");
	add("{\"term\":\"trout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02539716\", \"07810428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }