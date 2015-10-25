package org.swtk.commons.dict.wiktionary.generated.l.u.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLUR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lure", "{\"term\":\"lure\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"frankish\", \"old french (842-ca. 1400)\", \"anglo-norman\"], \"text\":\"Anglo-norman \u0027lure\u0027 from Old french (842-ca. 1400) \u0027loirre\u0027 (Modern French \u0027leurre\u0027 , from Frankish \u0027lothr\u0027 from Proto-germanic {{m|gem-pro|*lōþr-}}. Compare English \u0027allure\u0027 from Old French.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something that tempts or attracts, especially one with a promise of reward or pleasure\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An artificial bait attached to a fishing line to attract fish\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A bunch of feathers attached to a line, used in falconry to recall the hawk\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1594\u0027\u0027, w: William William Shakespeare, \u0027s: The Taming of the The Taming of the Shrew\u0027, IV. i. 178\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"My falcon now is sharp and passing empty, / And till she stoop she must not be full-gorged, / For then she never looks upon her \u0027\u0027lure\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A velvet smoothing brush\", \"priority\":6}]}, \"synonyms\":{}}");

	add("lurgy", "{\"term\":\"lurgy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"A nonce word popularized by w:Spike Milligan|Spike Milligan and w:Eric Sykes|Eric Sykes, scriptwriters for a 9 November 1954 programme of w:The Goon Show|The Goon Show, \u0026quot;w:List of Goon Show episode. Fifth series 1954|Lurgi Strikes Britain\u0026quot;, in which w:Neddie Seagoon|Ned Seagoon must deal with a national outbreak of a highly dangerous, highly infectious and — as it turns out — highly fictitious disease known as the Dreaded Lurgi.\u0026lt;ref name\u003d\u0026quot;Quinion\u0026quot;\u0026gt;{{cite web|publisher\u003dWorld Wide Words|last\u003dQuinion|first\u003dMichael|title\u003dThe Dreaded Lurgi|url\u003dhttp://www.worldwidewords.org/qa/qa-dre1.htm}}\u0026lt;/ref\u0026gt;w:Folk etymology|Folk etymologies for this word include:* that it is a w:corruption (linguistics)|corruption and contraction of the \u0027\u0027 This is not supported by the use of the hard \u0027g\u0027 in lurgi (rhyming with Fergie), as allergy has a softer \u0027g\u0027 sound similar to a hard \u0027j\u0027.\u0026lt;ref name\u003d\u0026quot;Quinion\u0026quot;/\u0026gt; * that it is based on the Northern English dialectic phrase \u0027fever-lurgy\u0027 () \u0026lt;ref name\u003d\u0026quot;Quinion\u0026quot;/\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fictitious, highly infectious disease; often used in the phrase \u0026quot;the dreaded lurgi\u0026quot;, sometimes as a reference to flu-like symptoms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lurker", "{\"term\":\"lurker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"lurk + -er, \u0027agentive suffix\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"agent Agent noun of lurk; one who lurks\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A user who observes a community rather than participating; someone who reads or takes advantage of content on a website, newsgroup, etc. but does not contribute\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A small fishing-boat.\u0026lt;!--per Webster 1913--\u0026gt\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lurve", "{\"term\":\"lurve\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Love, fondness\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }