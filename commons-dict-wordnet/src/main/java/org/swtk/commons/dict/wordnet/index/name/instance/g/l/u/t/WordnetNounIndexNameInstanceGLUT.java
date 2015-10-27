package org.swtk.commons.dict.wordnet.index.name.instance.g.l.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05127137\"]}");
	add("{\"term\":\"glutamate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908732\"]}");
	add("{\"term\":\"glutamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14630882\"]}");
	add("{\"term\":\"glute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05577760\"]}");
	add("{\"term\":\"glutelin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15050722\"]}");
	add("{\"term\":\"gluten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07585802\"]}");
	add("{\"term\":\"glutethimide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03446702\"]}");
	add("{\"term\":\"gluteus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05577760\"]}");
	add("{\"term\":\"glutinosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943390\"]}");
	add("{\"term\":\"glutinousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943390\"]}");
	add("{\"term\":\"glutton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02451981\", \"10152508\"]}");
	add("{\"term\":\"gluttony\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00760539\", \"04893296\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }