package org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOSS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"os scaphoideum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05279775\"]}");
	add("{\"term\":\"os sesamoideum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05288011\"]}");
	add("{\"term\":\"os sphenoidale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05288497\"]}");
	add("{\"term\":\"osseous labyrinth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05329465\"]}");
	add("{\"term\":\"osseous tissue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14782027\"]}");
	add("{\"term\":\"ossete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06988028\"]}");
	add("{\"term\":\"ossicle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05285227\"]}");
	add("{\"term\":\"ossiculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05285227\"]}");
	add("{\"term\":\"ossification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04809012\", \"13550055\", \"13550218\", \"13549953\"]}");
	add("{\"term\":\"osso buco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07888724\"]}");
	add("{\"term\":\"ossuary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863605\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }