package org.swtk.commons.dict.wordnet.index.name.instance.c.o.o.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOOK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cook\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10928065\", \"09982799\"]}");
	add("{\"term\":\"cookbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06424663\"]}");
	add("{\"term\":\"cooke\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10928286\", \"10928508\"]}");
	add("{\"term\":\"cooker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03105807\"]}");
	add("{\"term\":\"cookery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00244785\"]}");
	add("{\"term\":\"cookfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03105953\"]}");
	add("{\"term\":\"cookhouse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03106026\", \"03417130\"]}");
	add("{\"term\":\"cookie\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06399181\", \"09983159\", \"07650764\"]}");
	add("{\"term\":\"cooking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00244785\"]}");
	add("{\"term\":\"cookout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07592142\"]}");
	add("{\"term\":\"cookstove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03107022\"]}");
	add("{\"term\":\"cookware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03106637\"]}");
	add("{\"term\":\"cooky\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07650764\", \"09983159\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }