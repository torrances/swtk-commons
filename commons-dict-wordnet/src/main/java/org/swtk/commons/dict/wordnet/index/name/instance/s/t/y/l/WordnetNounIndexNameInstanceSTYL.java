package org.swtk.commons.dict.wordnet.index.name.instance.s.t.y.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTYL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"style\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"01903854\", \"04353589\", \"04820120\", \"06802072\", \"11697710\", \"05758160\", \"05852632\", \"07080699\", \"04936080\"]}");
	add("{\"term\":\"stylemark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04739783\"]}");
	add("{\"term\":\"styler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10175409\"]}");
	add("{\"term\":\"stylet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01903989\"]}");
	add("{\"term\":\"stylisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01162263\"]}");
	add("{\"term\":\"stylishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820943\"]}");
	add("{\"term\":\"stylist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10175409\", \"10686916\"]}");
	add("{\"term\":\"stylite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10687035\"]}");
	add("{\"term\":\"stylization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01162263\"]}");
	add("{\"term\":\"stylomecon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11928900\"]}");
	add("{\"term\":\"stylophorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11929187\"]}");
	add("{\"term\":\"stylopodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11697936\"]}");
	add("{\"term\":\"stylostixis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00711408\"]}");
	add("{\"term\":\"stylus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04353589\", \"04353757\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }