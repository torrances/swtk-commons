package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trisaccharide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105138\"]}");
	add("{\"term\":\"triskaidekaphobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14408089\"]}");
	add("{\"term\":\"triskele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04493140\"]}");
	add("{\"term\":\"triskelion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04493140\"]}");
	add("{\"term\":\"trismus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14595810\"]}");
	add("{\"term\":\"trisomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14528160\"]}");
	add("{\"term\":\"tristan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10570508\"]}");
	add("{\"term\":\"tristearin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105509\"]}");
	add("{\"term\":\"tristram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10570508\"]}");
	add("{\"term\":\"trisyllable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315328\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }