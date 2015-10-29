package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fusain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03011428\"]}");
	add("{\"term\":\"fusanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12757215\"]}");
	add("{\"term\":\"fusanus acuminatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12757363\"]}");
	add("{\"term\":\"fusarium wilt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14306925\"]}");
	add("{\"term\":\"fuschia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04971976\"]}");
	add("{\"term\":\"fuscoboletinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13078605\"]}");
	add("{\"term\":\"fuscoboletinus paluster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13078797\"]}");
	add("{\"term\":\"fuscoboletinus serotinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13079032\"]}");
	add("{\"term\":\"fuse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03412032\", \"03412279\"]}");
	add("{\"term\":\"fusee\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03412032\", \"03412526\", \"03412654\", \"03412775\"]}");
	add("{\"term\":\"fusee drive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03412775\"]}");
	add("{\"term\":\"fusel oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14991965\"]}");
	add("{\"term\":\"fuselage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03412964\"]}");
	add("{\"term\":\"fusible metal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14741006\"]}");
	add("{\"term\":\"fusil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413174\"]}");
	add("{\"term\":\"fusilier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10136236\"]}");
	add("{\"term\":\"fusillade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00990406\"]}");
	add("{\"term\":\"fusion\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00381376\", \"00700770\", \"05945279\", \"13506728\", \"13506970\", \"14442066\", \"07388202\"]}");
	add("{\"term\":\"fusion bomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03558428\"]}");
	add("{\"term\":\"fusion cooking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00247948\"]}");
	add("{\"term\":\"fusion reactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04429544\"]}");
	add("{\"term\":\"fuss\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00556175\", \"07199395\", \"07387165\", \"14427176\"]}");
	add("{\"term\":\"fussiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04707547\", \"07568195\"]}");
	add("{\"term\":\"fusspot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10811818\"]}");
	add("{\"term\":\"fustian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03413250\", \"07101969\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }