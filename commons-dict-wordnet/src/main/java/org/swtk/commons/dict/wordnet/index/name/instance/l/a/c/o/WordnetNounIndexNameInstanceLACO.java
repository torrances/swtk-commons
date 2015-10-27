package org.swtk.commons.dict.wordnet.index.name.instance.l.a.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLACO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"laconia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08805547\"]}");
	add("{\"term\":\"laconian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09730831\"]}");
	add("{\"term\":\"laconicism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07103723\"]}");
	add("{\"term\":\"laconism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07103723\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }