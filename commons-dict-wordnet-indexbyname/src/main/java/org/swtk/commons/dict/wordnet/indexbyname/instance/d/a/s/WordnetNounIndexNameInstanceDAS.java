package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"das\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02375236\"]}");
	add("{\"term\":\"das kapital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07297634\"]}");
	add("{\"term\":\"dash\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00557020\", \"06818820\", \"06856198\", \"07484183\", \"00295296\", \"04820120\"]}");
	add("{\"term\":\"dashboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03167888\", \"04288513\"]}");
	add("{\"term\":\"dasheen\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07752789\", \"11807008\", \"11807312\"]}");
	add("{\"term\":\"dashiell hammett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11046812\"]}");
	add("{\"term\":\"dashiki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03168047\"]}");
	add("{\"term\":\"dashing hopes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00069575\"]}");
	add("{\"term\":\"dassie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02375236\"]}");
	add("{\"term\":\"dastard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011967\"]}");
	add("{\"term\":\"dastardliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04868452\"]}");
	add("{\"term\":\"dasyatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01500519\"]}");
	add("{\"term\":\"dasyatis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01500909\"]}");
	add("{\"term\":\"dasyatis centroura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01501047\"]}");
	add("{\"term\":\"dasymeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03168315\"]}");
	add("{\"term\":\"dasypodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02456750\"]}");
	add("{\"term\":\"dasyprocta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368500\"]}");
	add("{\"term\":\"dasyprocta aguti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368654\"]}");
	add("{\"term\":\"dasyproctidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368324\"]}");
	add("{\"term\":\"dasypus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02457288\"]}");
	add("{\"term\":\"dasypus novemcinctus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02457425\"]}");
	add("{\"term\":\"dasyure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886561\"]}");
	add("{\"term\":\"dasyurid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886154\"]}");
	add("{\"term\":\"dasyurid marsupial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886154\"]}");
	add("{\"term\":\"dasyuridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01885853\"]}");
	add("{\"term\":\"dasyurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886403\"]}");
	add("{\"term\":\"dasyurus quoll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886745\"]}");
	add("{\"term\":\"dasyurus viverrinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01886844\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }