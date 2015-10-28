package org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"navaho\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06932489\", \"09682366\"]}");
	add("{\"term\":\"navajo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06932489\", \"09682366\"]}");
	add("{\"term\":\"navane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432791\"]}");
	add("{\"term\":\"navarino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01291288\"]}");
	add("{\"term\":\"nave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03818618\"]}");
	add("{\"term\":\"navel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08541929\", \"05564228\"]}");
	add("{\"term\":\"navicular\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05279775\"]}");
	add("{\"term\":\"navigability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726937\"]}");
	add("{\"term\":\"navigation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00315295\", \"01107642\", \"00817462\"]}");
	add("{\"term\":\"navigator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10367614\", \"10368096\", \"10565985\"]}");
	add("{\"term\":\"navratilova\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11221730\"]}");
	add("{\"term\":\"navvy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10055534\"]}");
	add("{\"term\":\"navy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08208917\", \"04976880\", \"08208631\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }