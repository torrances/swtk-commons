package org.swtk.commons.dict.wordnet.index.name.instance.l.a.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lava\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14955127\"]}");
	add("{\"term\":\"lavabo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04560989\"]}");
	add("{\"term\":\"lavage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00697740\"]}");
	add("{\"term\":\"lavalava\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03654317\"]}");
	add("{\"term\":\"lavalier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03654475\"]}");
	add("{\"term\":\"lavaliere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03654475\"]}");
	add("{\"term\":\"lavalliere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03654475\"]}");
	add("{\"term\":\"lavandula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12870357\"]}");
	add("{\"term\":\"lavatera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12202931\"]}");
	add("{\"term\":\"lavation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00256577\"]}");
	add("{\"term\":\"lavatory\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03376721\", \"04561206\", \"04453410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }