package org.swtk.commons.dict.wordnet.index.name.instance.l.a.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLACE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lace\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03636468\", \"03636736\"]}");
	add("{\"term\":\"lacebark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12201402\"]}");
	add("{\"term\":\"lacepod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11919692\"]}");
	add("{\"term\":\"lacer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10262136\"]}");
	add("{\"term\":\"laceration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00392101\", \"14310816\"]}");
	add("{\"term\":\"lacerta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01695661\"]}");
	add("{\"term\":\"lacertid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01695505\"]}");
	add("{\"term\":\"lacertidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01695354\"]}");
	add("{\"term\":\"lacertilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01676309\"]}");
	add("{\"term\":\"lacewing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02267015\"]}");
	add("{\"term\":\"lacewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12827842\"]}");
	add("{\"term\":\"lacework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03637001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }