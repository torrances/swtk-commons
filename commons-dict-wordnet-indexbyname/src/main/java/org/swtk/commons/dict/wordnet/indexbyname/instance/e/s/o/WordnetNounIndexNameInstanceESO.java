package org.swtk.commons.dict.wordnet.indexbyname.instance.e.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"esocidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02563454\"]}");
	add("{\"term\":\"esop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05921563\"]}");
	add("{\"term\":\"esophageal reflux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14358890\"]}");
	add("{\"term\":\"esophageal smear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05273235\"]}");
	add("{\"term\":\"esophageal veins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05374155\"]}");
	add("{\"term\":\"esophagitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14369220\"]}");
	add("{\"term\":\"esophagogastric junction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05578972\"]}");
	add("{\"term\":\"esophagoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03301892\"]}");
	add("{\"term\":\"esophagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05541581\"]}");
	add("{\"term\":\"esoterica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06686416\"]}");
	add("{\"term\":\"esotropia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14529835\"]}");
	add("{\"term\":\"esox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02563595\"]}");
	add("{\"term\":\"esox americanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02564568\"]}");
	add("{\"term\":\"esox lucius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02564012\"]}");
	add("{\"term\":\"esox masquinongy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02564145\"]}");
	add("{\"term\":\"esox niger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02564434\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }