package org.swtk.commons.dict.wordnet.index.name.instance.m.y.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"myopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14232683\"]}");
	add("{\"term\":\"myope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10363086\"]}");
	add("{\"term\":\"myopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14576882\"]}");
	add("{\"term\":\"myopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02347865\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }