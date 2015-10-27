package org.swtk.commons.dict.wordnet.index.name.instance.b.r.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brumaire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15201208\"]}");
	add("{\"term\":\"brummagem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08897840\"]}");
	add("{\"term\":\"brummell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10887984\"]}");
	add("{\"term\":\"brummie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897216\"]}");
	add("{\"term\":\"brummy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897216\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }