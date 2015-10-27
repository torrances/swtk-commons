package org.swtk.commons.dict.wordnet.index.name.instance.d.e.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDECE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"decease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07370091\"]}");
	add("{\"term\":\"deceased\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10014481\"]}");
	add("{\"term\":\"decedent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10014481\"]}");
	add("{\"term\":\"deceit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00753774\", \"06770936\", \"04882547\"]}");
	add("{\"term\":\"deceitfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04883756\"]}");
	add("{\"term\":\"deceiver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10017621\"]}");
	add("{\"term\":\"deceleration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00331500\", \"15301157\", \"05068514\"]}");
	add("{\"term\":\"december\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15238570\"]}");
	add("{\"term\":\"decency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04878454\", \"04907916\"]}");
	add("{\"term\":\"decennary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15229779\"]}");
	add("{\"term\":\"decennium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15229779\"]}");
	add("{\"term\":\"decentalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13478354\"]}");
	add("{\"term\":\"decentralisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01240623\"]}");
	add("{\"term\":\"decentralization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01240623\", \"13478354\"]}");
	add("{\"term\":\"deception\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00100771\", \"00753774\", \"06770936\"]}");
	add("{\"term\":\"deceptiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04882134\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }