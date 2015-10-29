package org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06580598\", \"08154738\"]}");
	add("{\"term\":\"dos passos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960466\"]}");
	add("{\"term\":\"dosage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03229941\", \"13794246\"]}");
	add("{\"term\":\"dose\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02678511\", \"14156641\", \"13794246\", \"03229941\"]}");
	add("{\"term\":\"dose rate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15302344\"]}");
	add("{\"term\":\"dosemeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230161\"]}");
	add("{\"term\":\"dosimeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230161\"]}");
	add("{\"term\":\"dosimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01004107\"]}");
	add("{\"term\":\"dossal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230319\"]}");
	add("{\"term\":\"dossel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230319\"]}");
	add("{\"term\":\"dosser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10046701\"]}");
	add("{\"term\":\"dosshouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03372167\"]}");
	add("{\"term\":\"dossier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06515542\"]}");
	add("{\"term\":\"dostoevski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"dostoevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"dostoyevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }