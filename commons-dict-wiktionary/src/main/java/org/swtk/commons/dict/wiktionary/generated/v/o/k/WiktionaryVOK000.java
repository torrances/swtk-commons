package org.swtk.commons.dict.wiktionary.generated.v.o.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVOK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("voken", "{\"term\":\"voken\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|virtual|token|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pop-up advertisement that is displayed over the top of the content but without spawning a separate window\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Keith J. Tuckwell, \u0027Canadian Marketing in Action\u0027 (page 425\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a Web portal that features \u0027\u0027voken\u0027\u0027-style campaigns\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Shaun Walker, Patrick J. Santry, Joe Brinkman, \u0027Professional DotNetNuke ASP.NET Portals\u0027 (page xxi\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"He also had a key role in designing and building the eyeReturn \u0027\u0027Voken\u0027\u0027 engine for online advertising and loyalty programs\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, \u0026quot;Spot3313\u0026quot;, \u0027Flash Voken Ads\u0027 (on newsgroup \u0027macromedia.flash\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Hey, I was approached today asking about \u0027\u0027Voken\u0027\u0027 ad\u0027s and if i knew how they were done\", \"priority\":7}]}, \"synonyms\":{}}");

	add("vokills", "{\"term\":\"vokills\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|vocals|kills|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"vocals performed in the death growl style\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }