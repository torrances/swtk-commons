package org.swtk.commons.dict.wordnet.index.name.instance.t.u.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTURN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"turn\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00293443\", \"01229572\", \"06905066\", \"15281525\", \"15317305\", \"00346280\", \"00347358\", \"07366212\", \"07437965\", \"00458406\", \"00350856\", \"13891966\"]}");
	add("{\"term\":\"turnabout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00347519\", \"05797813\"]}");
	add("{\"term\":\"turnaround\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00347519\", \"01147068\", \"04506955\", \"05797813\", \"15162247\"]}");
	add("{\"term\":\"turnbuckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04507105\"]}");
	add("{\"term\":\"turncoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10026763\"]}");
	add("{\"term\":\"turncock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04334820\", \"10752882\"]}");
	add("{\"term\":\"turndown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00206198\"]}");
	add("{\"term\":\"turner\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04507355\", \"10753007\", \"10753144\", \"10753231\", \"11372696\", \"11372878\", \"11373073\", \"11373190\"]}");
	add("{\"term\":\"turnery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04507589\", \"04507685\"]}");
	add("{\"term\":\"turnicidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02022220\"]}");
	add("{\"term\":\"turning\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00927993\", \"04507799\", \"07366212\", \"09487228\", \"00196264\", \"00350856\"]}");
	add("{\"term\":\"turnip\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07751779\", \"11898115\"]}");
	add("{\"term\":\"turnix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02022416\"]}");
	add("{\"term\":\"turnkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10169387\"]}");
	add("{\"term\":\"turnoff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04507999\", \"05836587\"]}");
	add("{\"term\":\"turnout\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00535517\", \"01236482\", \"03865478\", \"03866402\", \"04223173\", \"04508161\", \"08003658\"]}");
	add("{\"term\":\"turnover\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00349138\", \"05119608\", \"07640075\", \"13848434\"]}");
	add("{\"term\":\"turnpike\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04508313\", \"04508422\"]}");
	add("{\"term\":\"turnround\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01147068\"]}");
	add("{\"term\":\"turnspit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04508576\"]}");
	add("{\"term\":\"turnstile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04508665\"]}");
	add("{\"term\":\"turnstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02027697\"]}");
	add("{\"term\":\"turntable\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04509008\", \"04509132\", \"04508845\"]}");
	add("{\"term\":\"turnup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03150509\"]}");
	add("{\"term\":\"turnverein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08247600\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }