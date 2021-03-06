package org.swtk.commons.dict.wordnet.indexbyname.instance.d.i.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"difference\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13751346\", \"13881504\", \"07196595\", \"07380889\", \"04756076\"]}");
	add("{\"term\":\"difference limen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720839\"]}");
	add("{\"term\":\"difference of opinion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07196595\"]}");
	add("{\"term\":\"difference threshold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720839\"]}");
	add("{\"term\":\"differentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04756661\"]}");
	add("{\"term\":\"differential\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03198981\", \"04756532\", \"06024079\"]}");
	add("{\"term\":\"differential analyzer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03198854\"]}");
	add("{\"term\":\"differential blood count\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00654414\"]}");
	add("{\"term\":\"differential calculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06023784\"]}");
	add("{\"term\":\"differential coefficient\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06024079\"]}");
	add("{\"term\":\"differential cost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05152955\"]}");
	add("{\"term\":\"differential diagnosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00154319\"]}");
	add("{\"term\":\"differential equation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06683266\"]}");
	add("{\"term\":\"differential gear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03198981\"]}");
	add("{\"term\":\"differential limen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720839\"]}");
	add("{\"term\":\"differential psychology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06148586\"]}");
	add("{\"term\":\"differential threshold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720839\"]}");
	add("{\"term\":\"differentiation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13580985\", \"00872318\", \"05756230\"]}");
	add("{\"term\":\"differentiator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032560\"]}");
	add("{\"term\":\"difficultness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04716529\"]}");
	add("{\"term\":\"difficulty\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04716529\", \"14431490\", \"05694760\", \"00625102\"]}");
	add("{\"term\":\"diffidence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07538525\"]}");
	add("{\"term\":\"difflugia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01397412\"]}");
	add("{\"term\":\"diffraction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11467030\"]}");
	add("{\"term\":\"diffraction grating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03199222\"]}");
	add("{\"term\":\"diffuse nebula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09289696\"]}");
	add("{\"term\":\"diffuseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05095852\"]}");
	add("{\"term\":\"diffuser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03199496\", \"03199676\"]}");
	add("{\"term\":\"diffusing screen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03672386\"]}");
	add("{\"term\":\"diffusion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00369400\", \"05095263\", \"07346200\", \"13486733\"]}");
	add("{\"term\":\"diffusion pump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03091667\"]}");
	add("{\"term\":\"diffusor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03199496\", \"03199676\"]}");
	add("{\"term\":\"diflunisal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03199802\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }