package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14061746\", \"01028686\", \"13916847\"]}");
	add("{\"term\":\"ruta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12727800\"]}");
	add("{\"term\":\"rutabaga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11898329\", \"07752063\"]}");
	add("{\"term\":\"rutaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12727404\"]}");
	add("{\"term\":\"ruth\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06446038\", \"07569430\", \"11295942\", \"11296090\"]}");
	add("{\"term\":\"ruthenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14677421\"]}");
	add("{\"term\":\"rutherford\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11296275\", \"11296539\", \"13667702\"]}");
	add("{\"term\":\"rutherfordium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14677595\"]}");
	add("{\"term\":\"ruthfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07550597\"]}");
	add("{\"term\":\"ruthlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07521621\", \"04838495\"]}");
	add("{\"term\":\"rutile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15032966\"]}");
	add("{\"term\":\"rutilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01444976\"]}");
	add("{\"term\":\"rutland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09171620\"]}");
	add("{\"term\":\"rutledge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11296666\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }