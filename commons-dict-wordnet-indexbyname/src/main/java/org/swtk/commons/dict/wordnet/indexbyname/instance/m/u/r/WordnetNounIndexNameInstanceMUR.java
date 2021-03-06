package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"muraenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02529776\"]}");
	add("{\"term\":\"mural\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03805232\"]}");
	add("{\"term\":\"muralist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358211\"]}");
	add("{\"term\":\"muramidase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14968593\"]}");
	add("{\"term\":\"murder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00221389\"]}");
	add("{\"term\":\"murder charge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07250234\"]}");
	add("{\"term\":\"murder conviction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01196511\"]}");
	add("{\"term\":\"murder indictment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07250234\"]}");
	add("{\"term\":\"murder mystery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06382768\"]}");
	add("{\"term\":\"murder suspect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358964\"]}");
	add("{\"term\":\"murderee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358341\"]}");
	add("{\"term\":\"murderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358420\"]}");
	add("{\"term\":\"murderess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358892\"]}");
	add("{\"term\":\"murderousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04838135\", \"07563013\"]}");
	add("{\"term\":\"murdoch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11216754\", \"11216924\"]}");
	add("{\"term\":\"muriatic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14981196\"]}");
	add("{\"term\":\"muridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02334131\"]}");
	add("{\"term\":\"muriel sarah spark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11329608\"]}");
	add("{\"term\":\"muriel spark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11329608\"]}");
	add("{\"term\":\"murillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11217623\"]}");
	add("{\"term\":\"murine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02334494\"]}");
	add("{\"term\":\"murine typhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14164720\"]}");
	add("{\"term\":\"muritaniya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08989171\"]}");
	add("{\"term\":\"murk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14545250\"]}");
	add("{\"term\":\"murkiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04711046\", \"14545250\"]}");
	add("{\"term\":\"murmansk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09031093\"]}");
	add("{\"term\":\"murmur\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07225752\", \"14358219\", \"07128862\", \"07401520\"]}");
	add("{\"term\":\"murmur vowel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07128862\"]}");
	add("{\"term\":\"murmuration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07401520\"]}");
	add("{\"term\":\"murmurer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362274\"]}");
	add("{\"term\":\"murmuring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07225752\", \"07401520\"]}");
	add("{\"term\":\"muroidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02333482\"]}");
	add("{\"term\":\"murphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07726361\"]}");
	add("{\"term\":\"murphy bed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03805398\"]}");
	add("{\"term\":\"murrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14298094\"]}");
	add("{\"term\":\"murray\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09386317\", \"11217089\", \"11217407\"]}");
	add("{\"term\":\"murray river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09386317\"]}");
	add("{\"term\":\"murre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02049914\"]}");
	add("{\"term\":\"murrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11217733\"]}");
	add("{\"term\":\"murrumbidgee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09386517\"]}");
	add("{\"term\":\"murrumbidgee river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09386517\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }