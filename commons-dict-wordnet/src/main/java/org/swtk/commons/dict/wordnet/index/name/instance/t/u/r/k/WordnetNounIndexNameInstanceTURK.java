package org.swtk.commons.dict.wordnet.index.name.instance.t.u.r.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTURK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"turk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09754317\"]}");
	add("{\"term\":\"turkestan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08742378\"]}");
	add("{\"term\":\"turkey\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07379793\", \"07663340\", \"10243965\", \"09061886\", \"01796799\"]}");
	add("{\"term\":\"turki\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06939235\", \"09754690\"]}");
	add("{\"term\":\"turkic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06939235\"]}");
	add("{\"term\":\"turkish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06939575\"]}");
	add("{\"term\":\"turkistan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08742378\"]}");
	add("{\"term\":\"turkmen\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06939666\", \"09043873\", \"09755870\"]}");
	add("{\"term\":\"turkmenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043873\"]}");
	add("{\"term\":\"turkmenistan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043873\"]}");
	add("{\"term\":\"turkoman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06939666\", \"09755870\"]}");
	add("{\"term\":\"turkomen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043873\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }