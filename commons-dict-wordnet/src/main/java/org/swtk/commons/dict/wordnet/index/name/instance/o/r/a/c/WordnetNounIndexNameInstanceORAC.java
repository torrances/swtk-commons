package org.swtk.commons.dict.wordnet.index.name.instance.o.r.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851183\"]}");
	add("{\"term\":\"orache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851183\"]}");
	add("{\"term\":\"oracle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03858428\", \"06763053\", \"10503115\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }