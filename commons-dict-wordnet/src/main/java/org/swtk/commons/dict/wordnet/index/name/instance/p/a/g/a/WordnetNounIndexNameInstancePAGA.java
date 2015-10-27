package org.swtk.commons.dict.wordnet.index.name.instance.p.a.g.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAGA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pagad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08056353\"]}");
	add("{\"term\":\"pagan\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10187776\", \"10410601\", \"10185987\"]}");
	add("{\"term\":\"paganini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11239841\"]}");
	add("{\"term\":\"paganism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06234419\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }