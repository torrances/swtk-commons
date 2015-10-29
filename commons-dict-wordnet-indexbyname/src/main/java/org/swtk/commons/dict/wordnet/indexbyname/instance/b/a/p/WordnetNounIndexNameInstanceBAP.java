package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07696058\"]}");
	add("{\"term\":\"baphia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12529441\"]}");
	add("{\"term\":\"baphia nitida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12529614\"]}");
	add("{\"term\":\"baptisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12529802\"]}");
	add("{\"term\":\"baptisia australis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12530170\"]}");
	add("{\"term\":\"baptisia lactea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12530326\"]}");
	add("{\"term\":\"baptisia tinctoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12530498\"]}");
	add("{\"term\":\"baptism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01039851\"]}");
	add("{\"term\":\"baptismal font\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02791595\"]}");
	add("{\"term\":\"baptismal name\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06348828\"]}");
	add("{\"term\":\"baptist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09858089\"]}");
	add("{\"term\":\"baptist church\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08106386\"]}");
	add("{\"term\":\"baptist denomination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08106593\"]}");
	add("{\"term\":\"baptistery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02791595\"]}");
	add("{\"term\":\"baptistic doctrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06242201\"]}");
	add("{\"term\":\"baptistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02791595\"]}");
	add("{\"term\":\"baptists\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08106386\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }