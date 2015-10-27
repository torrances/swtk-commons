package org.swtk.commons.dict.wordnet.index.name.instance.l.a.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lamp\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03641940\", \"03641539\"]}");
	add("{\"term\":\"lampblack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14817703\"]}");
	add("{\"term\":\"lamphouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03642318\"]}");
	add("{\"term\":\"lamplight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11493360\"]}");
	add("{\"term\":\"lamplighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10264056\"]}");
	add("{\"term\":\"lampoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06793148\"]}");
	add("{\"term\":\"lampooner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10420697\"]}");
	add("{\"term\":\"lamppost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03642472\"]}");
	add("{\"term\":\"lamprey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01480166\"]}");
	add("{\"term\":\"lampridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02548200\"]}");
	add("{\"term\":\"lampris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02548318\"]}");
	add("{\"term\":\"lampropeltis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01736914\"]}");
	add("{\"term\":\"lampshade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03642609\"]}");
	add("{\"term\":\"lampshell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02318139\"]}");
	add("{\"term\":\"lampyridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02170773\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }