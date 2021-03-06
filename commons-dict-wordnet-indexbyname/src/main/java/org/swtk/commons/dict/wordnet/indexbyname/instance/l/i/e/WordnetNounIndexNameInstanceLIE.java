package org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lie\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08641771\", \"11151798\", \"06769542\"]}");
	add("{\"term\":\"lie detector\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03667778\"]}");
	add("{\"term\":\"liebfraumilch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07913575\"]}");
	add("{\"term\":\"liebig condenser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03667627\"]}");
	add("{\"term\":\"liechtenstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08980321\"]}");
	add("{\"term\":\"liechtensteiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09740484\"]}");
	add("{\"term\":\"lied\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07065660\"]}");
	add("{\"term\":\"lieder singer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278713\"]}");
	add("{\"term\":\"liederkranz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07869922\"]}");
	add("{\"term\":\"liege\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08870679\", \"10278791\", \"10766249\"]}");
	add("{\"term\":\"liege lord\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278791\"]}");
	add("{\"term\":\"liege subject\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766249\"]}");
	add("{\"term\":\"liegeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766249\"]}");
	add("{\"term\":\"lien\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05341015\", \"13422186\"]}");
	add("{\"term\":\"lienal artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05357609\"]}");
	add("{\"term\":\"liepaja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09035973\"]}");
	add("{\"term\":\"lietuva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09036200\"]}");
	add("{\"term\":\"lieu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00722683\"]}");
	add("{\"term\":\"lieutenancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595695\"]}");
	add("{\"term\":\"lieutenant\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10279224\", \"10024942\", \"10278922\", \"10279045\"]}");
	add("{\"term\":\"lieutenant colonel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10279477\"]}");
	add("{\"term\":\"lieutenant commander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10279694\"]}");
	add("{\"term\":\"lieutenant general\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10279863\"]}");
	add("{\"term\":\"lieutenant governor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10280019\"]}");
	add("{\"term\":\"lieutenant jg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10280170\"]}");
	add("{\"term\":\"lieutenant junior grade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10280170\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }