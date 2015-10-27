package org.swtk.commons.dict.wordnet.index.name.instance.c.r.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crumb\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07637870\", \"10559272\", \"13783120\"]}");
	add("{\"term\":\"crumbliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04946919\"]}");
	add("{\"term\":\"crumhorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03634122\"]}");
	add("{\"term\":\"crumpet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07646518\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }