package org.swtk.commons.dict.wordnet.indexbyname.instance.a.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"atrazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14653950\"]}");
	add("{\"term\":\"atresia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14072744\"]}");
	add("{\"term\":\"atreus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09617930\"]}");
	add("{\"term\":\"atrichornis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548530\"]}");
	add("{\"term\":\"atrichornithidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548393\"]}");
	add("{\"term\":\"atriplex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851039\"]}");
	add("{\"term\":\"atrium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02757661\", \"05400366\"]}");
	add("{\"term\":\"atrociousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04837574\"]}");
	add("{\"term\":\"atrocity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00425770\", \"04837574\"]}");
	add("{\"term\":\"atropa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12918986\"]}");
	add("{\"term\":\"atrophedema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14143792\"]}");
	add("{\"term\":\"atrophy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07441660\", \"14389146\"]}");
	add("{\"term\":\"atropidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02263836\"]}");
	add("{\"term\":\"atropine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02757761\"]}");
	add("{\"term\":\"atropos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09588916\"]}");
	add("{\"term\":\"atrovent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03589280\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }